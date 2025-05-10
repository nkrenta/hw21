package com.prosky.hw21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void testPlus() {
        assertEquals("5 + 5 = 10", calculatorService.plus(5, 5));
        assertEquals("5 + 7 = 12", calculatorService.plus(5, 7));
    }

    @Test
    public void testMinus() {
        assertEquals("5 - 5 = 0", calculatorService.minus(5, 5));
        assertEquals("7 - 5 = 2", calculatorService.minus(7, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals("5 x 5 = 25", calculatorService.multiply(5, 5));
        assertEquals("5 x 6 = 30", calculatorService.multiply(5, 6));
    }

    @Test
    public void testDivide() {
        assertEquals("5 / 5 = 1", calculatorService.divide(5, 5));
        assertEquals("6 / 3 = 2", calculatorService.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(DivideByZero.class, () -> calculatorService.divide(5, 0));
    }
}
