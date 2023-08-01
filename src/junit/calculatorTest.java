package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import calculator.calculator;

public class calculatorTest {
 private calculator calculator;

 @Before
 public void setUp() {
     calculator = new calculator();
 }

 @Test
 public void testAdd() {
     int result = calculator.add(3, 5);
     assertEquals(8, result); // Expects the result to be 8 (3 + 5)
 }

 @Test
 public void testSubtract() {
     int result = calculator.subtract(10, 3);
     assertEquals(7, result); // Expects the result to be 7 (10 - 3)
 }
}

