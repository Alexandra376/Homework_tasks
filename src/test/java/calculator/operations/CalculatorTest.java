package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdditionOperation() {
        calculator.setOperand1(2);
        calculator.setOperand2(3);
        calculator.setOperator("+");

        double result = calculator.calculate();
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testSubtractionOperation() {
        calculator.setOperand1(5);
        calculator.setOperand2(3);
        calculator.setOperator("-");

        double result = calculator.calculate();
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testMultiplicationOperation() {
        calculator.setOperand1(2);
        calculator.setOperand2(3);
        calculator.setOperator("*");

        double result = calculator.calculate();
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    void testDivisionOperation() {
        calculator.setOperand1(6);
        calculator.setOperand2(3);
        calculator.setOperator("/");

        double result = calculator.calculate();
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testInvalidOperator() {
        calculator.setOperand1(6);
        calculator.setOperand2(3);
        calculator.setOperator("%");

        assertThrows(IllegalArgumentException.class, () -> calculator.calculate());
    }

    @Test
    void testEmptyOperator() {
        calculator.setOperand1(6);
        calculator.setOperand2(3);
        calculator.setOperator("");

        assertThrows(IllegalArgumentException.class, () -> calculator.calculate());
    }
}
