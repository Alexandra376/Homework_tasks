package calculator.operations;

public class OperationUtils {

    public static void checkForOverflow(double a, double b) {
        if (a == Double.POSITIVE_INFINITY || b == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Переполнение при операции с бесконечностью");
        }
        if (a == Double.NEGATIVE_INFINITY || b == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Переполнение при операции с бесконечностью");
        }
    }

    public static void checkForResult(double result) {
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Результат выходит за пределы диапазона");
        }
        if (Double.isNaN(result)) {
            throw new ArithmeticException("Результат является (NaN)");
        }
    }
}
