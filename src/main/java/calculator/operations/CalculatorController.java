package calculator.operations;

public class CalculatorController {

    private final Calculator calculator = new Calculator();

    public double calculate(double numberOne, double numberTwo, String operation) {
        calculator.setOperand1(numberOne);
        calculator.setOperand2(numberTwo);
        calculator.setOperator(operation);
        return calculator.calculate();
    }
}
