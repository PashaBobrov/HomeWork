package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.API.ICalculator;

/*
4. Создать класс CalculatorWithMathExtends.
	4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	4.2 Данный класс должен наследовать класс CalculatorWithOperator.
	4.3 В классе должны присутствовать
		4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
		НЕ ДОЛЖНЫ быть объявлены в классе, а должны быть унаследованы от родительского класса.
		4.3.2 3 метода (Возведение в целую степень дробного положительного числа,
		Модуль числа, Корень из числа). Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского
		класса и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double pow(final double a, final int b) {
        return Math.pow(a, b);
    }

    @Override
    public double abs(final double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(final double a) {
        return Math.sqrt(a);
    }
}
