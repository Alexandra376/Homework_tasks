package calculator.operations;

import static calculator.operations.OperationUtils.checkForResult;

public class Division implements Operation {
    @Override
    public double execute(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        double result = a / b;

        checkForResult(result);

        return result;
    }
}
