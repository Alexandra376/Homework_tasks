package calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    private final Addition addition = new Addition();

    @Test
    void testAddition() {
        double result = addition.execute(2, 3);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testAdditionWithZero() {
        double result = addition.execute(5, 0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testAdditionWithNegativeNumber() {
        double result = addition.execute(5, -3);
        assertEquals(2.0, result, 0.0001);
    }
}
