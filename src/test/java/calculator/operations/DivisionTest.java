package calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivisionTest {
    private final Division division = new Division();

    @Test
    void testDivision() {
        double result = division.execute(6, 3);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> division.execute(1, 0));
    }

    @Test
    void testDivisionByOne() {
        double result = division.execute(7, 1);
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void testNegativeDivision() {
        double result = division.execute(-6, 3);
        assertEquals(-2.0, result, 0.0001);
    }

    @Test
    void testNegativeByNegativeDivision() {
        double result = division.execute(-8, -2);
        assertEquals(4.0, result, 0.0001);
    }
}
