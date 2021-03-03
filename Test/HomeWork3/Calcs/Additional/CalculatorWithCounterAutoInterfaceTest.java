package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;

class CalculatorWithCounterAutoInterfaceTest {
    public final ICalculator calc = new CalculatorWithCounterAutoInterface(new CalculatorWithMathExtends());
    @Test
    void testResult() {
        assertResult(calc);
    }
}