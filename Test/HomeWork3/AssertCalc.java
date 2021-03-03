package HomeWork3;

import HomeWork3.Calcs.API.ICalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertCalc {
   public static void assertResult(ICalculator calc) {
       //140.45999999999998
       //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        result = calc.divide(28, 5);
        result = calc.pow(result,2);
        result = calc.addition(result,4.1);
        result = calc.addition(result, calc.multiply(15,7));
        assertEquals(140.45,result,0.01);
    }
}
