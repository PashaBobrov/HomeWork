package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.API.ICalculator;

/**
 * Создать класс CalculatorWithMathCopy.
 * 	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	3.2 В классе должны присутствовать математические методы:
 * 		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		Скопировать базовые математические операции из CalculatorWithOperator.
 * 		3.2.2 3 метода (Возведение в целую степень дробного положительного числа,
 * 		Модуль числа, Корень из числа). Данные методы должны содержать в своём теле вызов
 * 		библиотеки Math и возврат полученного результата.
 */

public class CalculatorWithMathCopy implements ICalculator {
    public double addition(final double a, final double b) {
        return a + b;
    }

    public double subtract(final double a, final double b) {
        return a - b;
    }

    public double multiply(final double a, final double b) {
        return a * b;
    }

    public double divide(final double a, final double b) {
        return a / b;
    }

    public double pow(final double a, final int b) {
        return Math.pow(a, b);
    }

    public double abs(final double a) {
        return Math.abs(a);
    }

    public double sqrt(final double a) {
        return Math.sqrt(a);
    }

}
