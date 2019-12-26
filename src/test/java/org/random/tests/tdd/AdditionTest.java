package org.random.tests.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AdditionTest {

  @Test
  public void additionTest() {
    assertEquals(addition(1, 1), 2);
  }

  private int addition(int a, int b) {
    return a+b;
  }
}
