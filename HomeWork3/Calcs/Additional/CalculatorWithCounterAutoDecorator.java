package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.API.ICalculatorCounter;

public class CalculatorWithCounterAutoDecorator implements ICalculator, ICalculatorCounter {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        this.countOperation++;
    }

    @Override
    public double addition(final double a, final double b) {
        incrementCountOperation();
        return calculator.addition(a, b);
    }

    @Override
    public double subtract(final double a, final double b) {
        incrementCountOperation();
        return calculator.subtract(a, b);
    }

    @Override
    public double multiply(final double a, final double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    @Override
    public double divide(final double a, final double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    @Override
    public double pow(final double a, final int b) {
        incrementCountOperation();
        return calculator.pow(a, b);
    }

    @Override
    public double abs(final double a) {
        incrementCountOperation();
        return calculator.abs(a);
    }

    @Override
    public double sqrt(final double a) {
        incrementCountOperation();
        return calculator.sqrt(a);
    }

}
