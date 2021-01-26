package HomeWork3.Calcs.Additional;

/*
6. Создать класс CalculatorWithCounterAutoSuper.
	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
	6.2 Данный класс наследует класс CalculatorWithMathExtends.
	6.5 Данный класс переопределяет все методы полученные в результате наследования и в этих методах
	должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
	а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
	Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
	Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
	Использование super позволит вызвать реализацию из родительского класса.
	6.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

 */
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        this.countOperation++;
    }

    @Override
    public double addition(final double a, final double b) {
        incrementCountOperation();
        return  super.addition(a,b);
    }

    @Override
    public double subtract(final double a, final double b) {
        incrementCountOperation();
        return super.subtract(a,b);
    }

    @Override
    public double multiply(final double a, final double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    public double divide(final double a, final double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    @Override
    public double pow(final double a, final int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double abs(final double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double sqrt(final double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }


}
