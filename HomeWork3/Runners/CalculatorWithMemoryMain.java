package HomeWork3.Runners;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Additional.CalculatorWithCounterAutoInterface;
import HomeWork3.Calcs.Additional.CalculatorWithMemory;
import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 * посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование
 * переменных
 * для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора.
 */

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator
                = new CalculatorWithMemory(new CalculatorWithMathExtends());

        calculator.divide(28, 5);
        calculator.pow(calculator.readMemoryCell(),2);
        calculator.addition(calculator.readMemoryCell(),4.1);
        calculator.addition(calculator.readMemoryCell(), calculator.multiply(15,7));

        System.out.println(calculator.readMemoryCell()); //140.45999999999998
    }
}
