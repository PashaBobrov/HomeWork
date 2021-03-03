package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Additional.CalculatorWithMemoryDecorator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMathExtendsTest {
    public final ICalculator calc = new CalculatorWithMathExtends();
    @Test
    void testResult() {
        assertResult(calc);
    }

}