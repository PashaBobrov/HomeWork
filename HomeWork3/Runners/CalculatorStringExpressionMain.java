package HomeWork3.Runners;

import HomeWork3.Calcs.Additional.CalculatorStringExpression;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calculator
                = new CalculatorStringExpression(new CalculatorWithMathExtends());
        // -2*10+(5-Pi*(6/2 - 2 * (3-1)))*(2 -1) + E
        for (String arg : args) {
            if(calculator.isValideString(arg)) {
                System.out.println(arg + " = " + calculator.calcExpression(arg));
            } else {
                System.out.println(arg + " =! validate" );
            }

        }
    }
}
