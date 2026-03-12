package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-6, calculator.multiply(-2, 3));
    }
}
