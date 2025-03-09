package calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractionTest {
    private final Subtraction subtraction = new Subtraction();

    @Test
    void testSubtraction() {
        double result = subtraction.execute(5, 3);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testSubtractionWithZero() {
        double result = subtraction.execute(5, 0);
        assertEquals(5.0, result, 0.0001, "Вычитание нуля должно вернуть то же самое число");
    }

    @Test
    void testSubtractionItself() {
        double result = subtraction.execute(5, 5);
        assertEquals(0.0, result, 0.0001, "Число минус само себя должно быть 0");
    }

    @Test
    void testNegativeResult() {
        double result = subtraction.execute(3, 5);
        assertEquals(-2.0, result, 0.0001, "Ожидаемый отрицательный результат");
    }

    @Test
    void testNegativeMinusNegative() {
        double result = subtraction.execute(-5, -3);
        assertEquals(-2.0, result, 0.0001, "Отрицательное число минус отрицательное дает тот же эффект, что обычные числа");
    }
}
