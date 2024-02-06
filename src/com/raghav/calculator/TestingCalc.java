// Specifying the PACKAGE-NAME for the test class "TestingCalc"
package com.raghav.calculator;

// Importing necessary JUnit classes for testing
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Test class for the class "Calc" in the "com.raghav.calculator" package
public class TestingCalc {

    // Test method for the add operation
    @Test
    public void testSum() {
        assertEquals(5, Calc.SUM(2, 3));	// To check the result of the 'SUM' method matches the expected result or not
    }
    // Test method for the subtract operation
    @Test
    public void testSubtract() {
        assertEquals(1, Calc.SUBTRACT(4, 3));	// To check the result of the 'SUBTRACT' method matches the expected result or not
    }
    // Test method for the multiply operation
    @Test
    public void testMultiply() {
        assertEquals(12, Calc.MULTIPLY(4, 3));	// To check the result of the 'MULTIPLY' method matches the expected result or not
    }
    // Test method for the divide operation
    @Test
    public void testDivide() {
        assertEquals(2, Calc.DIVIDE(6, 3));	// To check the result of the 'DIVIDE' method matches the expected result or not
    }
    // Test method for handling division by zero
    @Test
    public void testDivideByZero() {
        assertEquals(0, Calc.DIVIDE(8, 0));	// To check the result of the 'DIVIDE' method when dividing by zero is 0 or not
    }
}