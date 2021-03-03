package HomeWork3.Calcs.Additional;

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static HomeWork3.AssertCalc.assertResult;

class CalculatorWithCounterAutoDecoratorTest {
    public final ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
    @Test
    void testResult() {
        assertResult(calc);
    }

}