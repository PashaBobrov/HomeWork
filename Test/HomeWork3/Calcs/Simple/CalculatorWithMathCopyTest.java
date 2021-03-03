package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathCopyTest {
    private final CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

    @Test
    void testResult() {
        assertResult(calc);
    }
}
