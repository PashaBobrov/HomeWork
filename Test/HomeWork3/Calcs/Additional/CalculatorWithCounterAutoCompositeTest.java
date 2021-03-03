package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoCompositeTest {
    public final ICalculator calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
    @Test
    void testResult() {
        assertResult(calc);
    }
}