package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;

/**
 * 12**. Написать класс CalculatorStringExpression. Данное задание направлено на изучение паттера Адаптер.
 * 	12.0 О адаптерах можно прочитать по ссылкам:
 * 		12.0.1 https://refactoring.guru/ru/design-patterns/adapter
 * 		12.0.2 https://www.wikiwand.com/ru/%D0%90%D0%B4%D0%B0%D0%BF%D1%82%D0%B5%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
 * 	12.1 реализующий разбор (парсинг) СТРОКИ с математическим выражением:
 * 	12.2 Класс должен понимать операторы: + - \ * ^ ||
 * 	12.3 Класс должен понимать ( )
 * 	12.4 Класс должен строго учитывать приоритеты в данном выражении
 * 	12.5 Класс должен уметь парсить в строке константные значение: PI, E (Экспонента)
 * 	12.6 Класс должен контролировать что в строке могут быть только допустие символы (числа, операторы,
 * 	скобки, константы)
 * 	12.7 Класс должен контролировать чтобы выражение было валидным (2 + 2 - хорошо, 2 + - плохо)
 */

public class CalculatorStringExpression {
    private ICalculator calculator;
    private final String[][] OPERATORS_PRIORITET = {{"^","1"},{"*","2"},{"/","2"},{"+","3"},{"-","3"}};
    private final int MAX_PRIORITET = 3;

    public CalculatorStringExpression(ICalculator calculator) {
        this.calculator = calculator;
    }


    public int getPrioritet(String operator) {
        for (int i = 0; i < OPERATORS_PRIORITET.length; i++) {
            if(OPERATORS_PRIORITET[i][0].equals(operator.substring(0,1))) {
                return Integer.valueOf(OPERATORS_PRIORITET[i][1]);
            }
        }
        return  0;
    }

    public boolean isValideString(String expression) {

        String strPattern = "[\\-\\+\\\\\\*\\^]$";
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(expression);

        return !matcher.find();
    }

    private String prepareString(String expression) {

        expression = expression.replace(" ","");
        expression = expression.toUpperCase(Locale.ROOT);
        if(expression.startsWith("-")) {
            expression = "0" + expression;
        }
        expression = expression.replace("PI", String.valueOf(Math.PI));
        expression = expression.replace("E", String.valueOf(Math.E));

        return expression;
    }

    public double calcExpression(String expression) {
        expression = prepareString(expression);
        double result = Double.valueOf(parsingExpression(expression));

        return result;
    }

    private String parsingExpression(String expression) {
        String result = "";

        int index = 0;
        //просчитывем значения в скобках, начиная с самых глубоких
        while (expression.indexOf("(", index) > 0) {
            int indexOpen = expression.indexOf("(", index);
            int indexClose = expression.indexOf(")", index);
            int indexOpenNext = expression.indexOf("(", indexOpen + 1);
            if (indexOpenNext > 0 && indexOpenNext < indexClose) {
                index = indexOpenNext;
                continue;
            } //Else иначе попали в самую вложенную скобку

            //рекурсивно заменяем в строке данные в скобках на результат, который будем использовать далее в выражении
            // и избавляемся от скобок дальше
            String tmpResult = parsingExpression(expression.substring(indexOpen + 1, indexClose));
            expression = expression.replace(expression.substring(indexOpen, indexClose+1), tmpResult);
            index = 0;
        }
        //на входе уже нормализовоное выражение без скобок
        result = calcSimpleExpression(expression);
        return result;
    }

    private String calcSimpleExpression(String expression){
        String result;
        Double dResult = 0d;

        String[] operands = removeEmtyElementFromArray(expression.split("[*/+^-]"));
        String[] operators = removeEmtyElementFromArray(expression.split("[0-9.]+"));

        int indexResult = 0;
        for (int iPrioritet = 1; iPrioritet <= MAX_PRIORITET; iPrioritet++) {
            for (int j = 0; j < operators.length; j++) {
                if (iPrioritet == getPrioritet(operators[j])) {
                    dResult = calc(operands[j],operands[j + 1],operators[j]);
                    operands[j+1] = String.valueOf(dResult);
                    operands[j] = "";
                    operators[j] = "";
                }
            }
            operands = removeEmtyElementFromArray(operands);
            operators = removeEmtyElementFromArray(operators);
        }
        return String.valueOf(dResult);
    }

    private String[] removeEmtyElementFromArray(String[] array) {
        String[] result;
        int size = array.length;
        for (String str : array) {
            if (str.equals("")) {
                size--;
            }
        }
        result = new String[size];
        int index = 0;
        for (String str : array) {
            if (!str.equals("")) {
                result[index++] = str;
            }
        }

        return result;
    }


    private double calc(String value1,String value2,String operator){
        Double result;
        Double dValue1 = Double.valueOf(value1);
        Double dValue2 = Double.valueOf(value2);

        //операторы со знаком "-" от операнда
        if (operator.length() > 1) {
            if (operator.substring(1,2).equals("-")){
                dValue2 = -dValue2;
                operator = operator.substring(0,1);
            }
        }

        switch (operator){
            case ("+"):
                result = calculator.addition(dValue1,dValue2);
                break;
            case ("-"):
                result = calculator.subtract(dValue1,dValue2);
                break;
            case ("*"):
                result = calculator.multiply(dValue1,dValue2);
                break;
            case ("/"):
                result = calculator.divide(dValue1,dValue2);
                break;
            case ("^"):
                result = calculator.pow(dValue1,dValue2.intValue());
                break;
            default: result = 0d;
        }

        return result;
    }
}
