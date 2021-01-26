package HomeWork3.Runners;

import HomeWork3.Calcs.Simple.*;
import HomeWork3.Calcs.Additional.CalculatorWithCounterAutoComposite;

/**
Создать класс CalculatorWithCounterAutoCompositeMain в котором будет точка входа (main метод).
 В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат
 метода getCountOperation().
 */

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite сalculatorWithCounterAutoComposite
                = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
        double result;

        result = сalculatorWithCounterAutoComposite.divide(28, 5);
        result = сalculatorWithCounterAutoComposite.pow(result,2);
        result = сalculatorWithCounterAutoComposite.addition(result,4.1);
        result = сalculatorWithCounterAutoComposite.addition(result, сalculatorWithCounterAutoComposite.multiply(15,7));

        System.out.println(result); //140.45999999999998
        System.out.println(сalculatorWithCounterAutoComposite.getCountOperation()); //5

    }
}
