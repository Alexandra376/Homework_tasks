package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calculatorController;

    @BeforeEach
    void setUp() {
        calculatorController = new CalculatorController();
    }

    @Test
    void testCalculateAddition() {
        double result = calculatorController.calculate(2, 3, "+");
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testCalculateSubtraction() {
        double result = calculatorController.calculate(5, 3, "-");
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testCalculateMultiplication() {
        double result = calculatorController.calculate(2, 3, "*");
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    void testCalculateDivision() {
        double result = calculatorController.calculate(6, 3, "/");
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testCalculateInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> calculatorController.calculate(6, 3, "%"));
    }
}
