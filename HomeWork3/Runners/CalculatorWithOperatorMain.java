package HomeWork3.Runners;

/*
2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
В main методе требуется создать экземпляр калькулятора и используя методы из данного
экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
4.1 + 15 * 7 + (28 / 5) ^ 2
 */

import HomeWork3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double result;
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        result = calculatorWithOperator.divide(28, 5);
        result = calculatorWithOperator.pow(result,2);
        result = calculatorWithOperator.addition(result,4.1);
        result = calculatorWithOperator.addition(result, calculatorWithOperator.multiply(15,7));

        System.out.println(result); //140.45999999999998
    }
}
