package HomeWork3.Runners;

import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;

/**
 * 4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        double result;
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        result = calculatorWithMathExtends.divide(28, 5);
        result = calculatorWithMathExtends.pow(result,2);
        result = calculatorWithMathExtends.addition(result,4.1);
        result = calculatorWithMathExtends.addition(result, calculatorWithMathExtends.multiply(15,7));
        System.out.println(result); //140.45999999999998
    }

}
