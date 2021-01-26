package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.API.ICalculator;

/**
 * 2. Создать класс CalculatorWithOperator.
 * 	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	2.2 В классе должны присутствовать математические методы:
 * 		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый
 * 		из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать
 * 		результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа,
 * 		Корень из числа).
 * 	2.3 В методах можно использовать любые арифметические операторы.
 * 	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня).
 * 	Если у Вас плохо с математикой, то для реализации метода "Корень из числа"
 * 	можно воспользоваться библиотекой Math.
 */

public class CalculatorWithOperator implements ICalculator {

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
        double result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public double abs(final double a) {
        return a >= 0 ? a : -a;
    }

    public double sqrt(final double a) {

        double result = a;
        double div = a;

        if (a <= 0) {
            return 0;
        }

        while(true) {
            div = (a / div + div) / 2;
            if (result > div) {
                result = div;
            }
            else {
                return result;
            }
        }
    }
}
