package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;

/**
 * 10*. Создать CalculatorWithMemory.
 * 	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и
 * 	обеспечить его дополнительной функцией памяти. В принципе работает как калькулятор из
 * 	реальной жизни.
 * 	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	10.3 Данный класс напрямую не умеет считать математику.
 * 	10.4 В классе должны присутствовать математические методы:
 * 		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа,
 * 		Корень из числа).
 * 	10.5 Функция памяти работает через методы:
 * 		10.5.1 Записать в память результат выполнения последнего вызванного метода. У данного
 * 		метода не должно быть параметров.
 * 		10.5.2 Получить из памяти записанное значение. При получении записи из памяти память
 * 		стирается, при записи нового значения память перезаписывается.
 */
public class CalculatorWithMemory implements ICalculator {
    private double memoryCell;
    ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    private void saveMemoryCell(double value) {
        memoryCell = value;
    }

    public double readMemoryCell() {
        double result = memoryCell;
        memoryCell = 0;
        return result;
    }


    public double addition(final double a, final double b) {
        double result = calculator.addition(a, b);
        saveMemoryCell(result);
        return result;
    }

    public double subtract(final double a, final double b) {
        double result = calculator.subtract(a, b);
        saveMemoryCell(result);
        return result;
    }

    public double multiply(final double a, final double b) {
        double result = calculator.multiply(a, b);
        saveMemoryCell(result);
        return result;
    }

    public double divide(final double a, final double b) {
        double result = calculator.divide(a, b);
        saveMemoryCell(result);
        return result;
    }

    public double pow(final double a, final int b) {
        double result = calculator.pow(a, b);
        saveMemoryCell(result);
        return result;
    }

    public double abs(final double a) {
        double result = calculator.abs(a);
        saveMemoryCell(result);
        return result;
    }

    public double sqrt(final double a) {
        double result = calculator.sqrt(a);
        saveMemoryCell(result);
        return result;
    }


}
