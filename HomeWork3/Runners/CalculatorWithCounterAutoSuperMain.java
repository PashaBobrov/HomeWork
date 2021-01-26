package HomeWork3.Runners;
/*
6.7 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод).
В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат
метода getCountOperation().
 */

import HomeWork3.Calcs.Additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper
                = new CalculatorWithCounterAutoSuper();
        double result;

        result = calculatorWithCounterAutoSuper.divide(28, 5);
        result = calculatorWithCounterAutoSuper.pow(result,2);
        result = calculatorWithCounterAutoSuper.addition(result,4.1);
        result = calculatorWithCounterAutoSuper.addition(result, calculatorWithCounterAutoSuper.multiply(15,7));

        System.out.println(result); //140.45999999999998
        System.out.println(calculatorWithCounterAutoSuper.getCountOperation()); //5
    }
}
