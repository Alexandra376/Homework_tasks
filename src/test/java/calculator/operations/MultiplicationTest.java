package calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    private final Multiplication multiplication = new Multiplication();

    @Test
    void testMultiplication() {
        double result = multiplication.execute(2, 3);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    void testMultiplicationWithZero() {
        double result = multiplication.execute(5, 0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testMultiplicationWithNegativeNumber() {
        double result = multiplication.execute(-2, 3);
        assertEquals(-6.0, result, 0.0001);
    }
}
