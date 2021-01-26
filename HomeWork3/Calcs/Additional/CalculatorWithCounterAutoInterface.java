package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.*;

/**
 * 9. Создать класс CalculatorWithCounterAutoInterface.
 * 	9.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем
 * 	что передал вам пользователь вашего класса.
 * 	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики
 * 	другим калькуляторам переданным в конструктор
 * 	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
 * 	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */

public class CalculatorWithCounterAutoInterface {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        this.countOperation++;
    }

    public double addition(final double a, final double b) {
        incrementCountOperation();
        return calculator.addition(a, b);
    }

    public double subtract(final double a, final double b) {
        incrementCountOperation();
        return calculator.subtract(a, b);
    }

    public double multiply(final double a, final double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    public double divide(final double a, final double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    public double pow(final double a, final int b) {
        incrementCountOperation();
        return calculator.pow(a, b);
    }

    public double abs(final double a) {
        incrementCountOperation();
        return calculator.abs(a);
    }

    public double sqrt(final double a) {
        incrementCountOperation();
        return calculator.sqrt(a);
    }

}
