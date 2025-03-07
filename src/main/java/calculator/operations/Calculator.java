package calculator.operations;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public double calculate(String operator, double a, double b) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Некорректная операция: " + operator);
        }
        return operation.execute(a, b);
    }
}
