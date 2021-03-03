package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Test;
import static HomeWork3.AssertCalc.assertResult;

class CalculatorWithMemoryDecoratorTest {
    public final ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
    @Test
    void testResult() {
        assertResult(calc);
    }
}