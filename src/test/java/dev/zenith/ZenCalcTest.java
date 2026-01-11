package dev.zenith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZenCalcTest {
  ZenCalc calculator = new ZenCalc();

  @Test
  void testAddition() {
    double result = calculator.calculate(10, 5, "add");
    assertEquals(15.0, result, "10 + 5 equals 15");
  }

  @Test
  void testMultiplication() {
    assertEquals(50.0, calculator.calculate(10, 5, "mul"));
  }

  @Test
  void testDivision() {
    assertEquals(2.0, calculator.calculate(10, 5, "div"));
  }

  @Test
  void divisionByZero() {
    Exception exception = assertThrows(ArithmeticException.class, () -> {
      calculator.calculate(10, 0, "div");
    });

    assertEquals("Cannot divide by Zero.", exception.getMessage());
  }

  @Test
  void unknownOperation() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.calculate(10, 5, "magic");
    });
  }

}
