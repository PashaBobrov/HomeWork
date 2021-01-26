package HomeWork3.Calcs.Additional;

/**
 * 5. Создать класс CalculatorWithCounterClassic.
 * 	5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать
 * 	внутренний счётчик в калькуляторе.
 * 	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество
 * 	использований данного калькулятора.
 * 	5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
 * 	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 * 	посчитать выражения из задания 1. Вывести в консоль результат.
 */

import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int countOperation;

    public int getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

}
