package HomeWork3.Calcs.Additional;

/**
 * . Создать класс CalculatorWithCounterAutoComposite.
 * 	7.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал
 * 	вам пользователь вашего класса.
 * 	7.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	7.3 В данном классе должны быть следующие варианты конструктора:
 * 		7.3.1 Принимающий объект типа CalculatorWithOperator
 * 		7.3.2 Принимающий объект типа CalculatorWithMathCopy
 * 		7.3.3 Принимающий объект типа CalculatorWithMathExtends
 * 	7.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики
 * 	другим калькуляторам переданным в конструктор
 * 	7.5 В классе должны присутствовать математические методы:
 * 		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
 * 	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */

import HomeWork3.Calcs.API.ICalculator;
import HomeWork3.Calcs.Simple.*;

public class CalculatorWithCounterAutoComposite implements ICalculator {
    /* @calculator переменная для экземплара класса ' CalculatorWithMathExtends и
    родительского класса CalculatorWithOperator
     */
    private CalculatorWithOperator calculator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private boolean isCalculatorWithMathCopy;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculator = calculatorWithOperator;
        isCalculatorWithMathCopy = false;
    }


  public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
      this.calculatorWithMathCopy = calculatorWithMathCopy;
      isCalculatorWithMathCopy = true;
  }
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculator = calculatorWithMathExtends;
        isCalculatorWithMathCopy = false;
    }

    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        this.countOperation++;
    }

    public double addition(final double a, final double b) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.addition(a, b);
        } else {
            return calculator.addition(a, b);
        }

    }

    public double subtract(final double a, final double b) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.subtract(a, b);
        } else {
            return calculator.subtract(a, b);
        }

    }

    public double multiply(final double a, final double b) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.multiply(a, b);
        } else {
            return calculator.multiply(a, b);
        }
    }

    public double divide(final double a, final double b) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.divide(a, b);
        } else {
            return calculator.divide(a, b);
        }
    }

    public double pow(final double a, final int b) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.pow(a, b);
        } else {
            return calculator.pow(a, b);
        }
    }

    public double abs(final double a) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.abs(a);
        } else {
            return calculator.abs(a);
        }
    }

    public double sqrt(final double a) {
        incrementCountOperation();
        if (isCalculatorWithMathCopy) {
            return calculatorWithMathCopy.sqrt(a);
        } else {
            return calculator.sqrt(a);
        }
    }


}
