package calculator.operations;

import static calculator.operations.OperationUtils.checkForOverflow;
import static calculator.operations.OperationUtils.checkForResult;

public class Addition implements Operation {
    @Override
    public double execute(double a, double b) {

        checkForOverflow(a, b);

        double result = a + b;

        checkForResult(result);

        return result;
    }
}
