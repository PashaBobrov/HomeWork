package HomeWork3.Calcs.API;

/**
 * 8. Создать интерфейс ICalculator.
 * 	8.1 В данном интерфейсе должны быть объявлены методы:
 * 		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа,
 * 		Корень из числа).
 * 	8.2 Данный интерфейс должен быть прописан во всех классах наших калькуляторов кроме
 * 	созданных в предыдущих пунктах CalculatorWithCounter*** (implements ICalculator)
 */

public interface ICalculator {

    public double addition(final double a, final double b);

    public double subtract(final double a, final double b);

    public double multiply(final double a, final double b);

    public double divide(final double a, final double b);

    public double pow(final double a, final int b);

    public double abs(final double a);

    public double sqrt(final double a);

}

