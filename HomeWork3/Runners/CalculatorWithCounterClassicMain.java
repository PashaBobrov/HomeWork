package HomeWork3.Runners;

/**
 * Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

import HomeWork3.Calcs.Additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic
                = new CalculatorWithCounterClassic();
        double result;

        result = calculatorWithCounterClassic.divide(28, 5);
        calculatorWithCounterClassic.incrementCountOperation();

        result = calculatorWithCounterClassic.pow(result,2);
        calculatorWithCounterClassic.incrementCountOperation();

        result = calculatorWithCounterClassic.addition(result,4.1);
        calculatorWithCounterClassic.incrementCountOperation();

        result = calculatorWithCounterClassic.addition(result, calculatorWithCounterClassic.multiply(15,7));
        calculatorWithCounterClassic.incrementCountOperation();
        calculatorWithCounterClassic.incrementCountOperation();

        System.out.println(result); //140.45999999999998
        System.out.println(calculatorWithCounterClassic.getCountOperation()); //5

    }
}
