package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;

class CalculatorWithMemoryTest {
    public final ICalculator calc = new CalculatorWithMemory(new CalculatorWithOperator());
    @Test
    void testResult() {
        assertResult(calc);
    }

}