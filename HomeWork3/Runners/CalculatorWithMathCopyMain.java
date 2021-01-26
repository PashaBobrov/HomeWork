package HomeWork3.Runners;

import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        double result;
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        result = calculatorWithMathCopy.divide(28, 5);
        result = calculatorWithMathCopy.pow(result,2);
        result = calculatorWithMathCopy.addition(result,4.1);
        result = calculatorWithMathCopy.addition(result, calculatorWithMathCopy.multiply(15,7));
        System.out.println(result); //140.45999999999998
    }
}
