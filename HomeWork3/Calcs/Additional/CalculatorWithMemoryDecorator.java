package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.API.ICalculatorMemory;

public class CalculatorWithMemoryDecorator implements ICalculator, ICalculatorMemory{
    ICalculator calculator;
    private double memoryCell;

    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    private void saveMemoryCell(double value) {
        memoryCell = value;
    }

    @Override
    public double readMemoryCell() {
        double result = memoryCell;
        memoryCell = 0;
        return result;
    }

    @Override
    public double addition(final double a, final double b) {
        double result = calculator.addition(a, b);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double subtract(final double a, final double b) {
        double result = calculator.subtract(a, b);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double multiply(final double a, final double b) {
        double result = calculator.multiply(a, b);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double divide(final double a, final double b) {
        double result = calculator.divide(a, b);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double pow(final double a, final int b) {
        double result = calculator.pow(a, b);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double abs(final double a) {
        double result = calculator.abs(a);
        saveMemoryCell(result);
        return result;
    }

    @Override
    public double sqrt(final double a) {
        double result = calculator.sqrt(a);
        saveMemoryCell(result);
        return result;
    }
}
