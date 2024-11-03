package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int a = 0;
        int b = 3;
        Calculator calculator = new Calculator();
        // Act
        int sum = calculator.add(a, b);
        // Assert
        assertEquals(3, sum);
    }

    @Test
    public void testDivide() {
        int a = 6;
        int b = 3;
        Calculator calculator = new Calculator();
        // Act
        int quotient = calculator.divide(a, b);
        // Assert
        assertEquals(2, quotient);
    }

    @Test
    public void testMultiply() {
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();
        // Act
        int product = calculator.multiply(a, b);
        // Assert
        assertEquals(6, product);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;
        Calculator calculator = new Calculator();
        // Act
        int difference = calculator.subtract(a, b);
        // Assert
        assertEquals(2, difference);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 6;
        int b = 0;
        Calculator calculator = new Calculator();
        // Act
        calculator.divide(a, b);
    }
}
