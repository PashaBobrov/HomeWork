package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;

class CalculatorWithCounterClassicTest {
    public final ICalculator calc = new CalculatorWithCounterClassic();
    @Test
    void testResult() {
        assertResult(calc);
    }

}