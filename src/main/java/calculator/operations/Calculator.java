package calculator.operations;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations = new HashMap<>();

    private double operand1;
    private double operand2;
    private String operator;

    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public double calculate() {
        if (operator == null || operator.isEmpty()) {
            throw new IllegalArgumentException("Оператор не установлен.");
        }

        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Некорректная операция: " + operator);
        }

        return operation.execute(operand1, operand2);
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
