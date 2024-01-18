import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply2() {
        Calculator calc1 = new Calculator();
        assertEquals(2, calc1.multiply(1, 2));
    }

    @Test
    void multiply3() {
        Calculator calc2 = new Calculator();
        assertEquals(6, calc2.multiply(1, 2, 3));

    }

    @Test
    void multiply4() {
        Calculator calc3 = new Calculator();
        assertEquals(24, calc3.multiply(1, 2, 3,4));

    }
}