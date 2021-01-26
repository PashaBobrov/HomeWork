package HomeWork3.Runners;

/**
 * 9.7 Создать класс CalculatorWithCounterAutoInterfaceMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 * посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат
 * метода getCountOperation().
 */

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.*;
import HomeWork3.Calcs.Additional.CalculatorWithCounterAutoInterface;

public class CalculatorWithCounterAutoInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoInterface calculatorWithCounterAutoInterface
                = new CalculatorWithCounterAutoInterface(new CalculatorWithMathExtends());
        double result;

        result = calculatorWithCounterAutoInterface.divide(28, 5);
        result = calculatorWithCounterAutoInterface.pow(result,2);
        result = calculatorWithCounterAutoInterface.addition(result,4.1);
        result = calculatorWithCounterAutoInterface.addition(result, calculatorWithCounterAutoInterface.multiply(15,7));

        System.out.println(result); //140.45999999999998
        System.out.println(calculatorWithCounterAutoInterface.getCountOperation()); //5

    }
}
