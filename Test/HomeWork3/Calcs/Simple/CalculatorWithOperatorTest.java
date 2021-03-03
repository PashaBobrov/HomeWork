package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.API.ICalculator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithOperatorTest {
    public final ICalculator calc = new CalculatorWithOperator();
    @Test
    void testResult() {
        assertResult(calc);
    }

}