package HomeWork3.Runners;

/*
1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
	Внимание, знак "^" обозначает возведение в степень.
Достаточно простые выражения, с которыми, на данный момент, проблем уже не должно возникать.
Давайте больше структурировать наш код.
В будущем это позволит довольно быстро и безболезненно увеличивать функциональность приложения.
 */

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result;

        result = 4.1 + 15 * 7 + Math.pow(((double) 28 / 5),2);
        System.out.println(result); //140.45999999999998
    }
}
