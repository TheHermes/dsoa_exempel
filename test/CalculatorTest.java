import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply1() {
        Calculator calc1 = new Calculator();
        assertEquals(2, calc1.multiply(1, 2));
    }

    @Test
    void testMultiply() {
        Calculator calc2 = new Calculator();
        assertEquals(6, calc2.multiply(1, 2, 3));

    }

    @Test
    void testMultiply1() {
        Calculator calc3 = new Calculator();
        assertEquals(24, calc3.multiply(1, 2, 3,4));

    }
}