package practice;

import static practice.Mathx.*;

public class FactorialTest {

  // public static void baseCase() {
  // if (factorial(0) == 1) {
  // return;
  // }
  // System.exit(1);
  // }

  public static void baseCase() {
    assert factorial(0) == 1;
  }

  public static void recursionCase() {
    int[] answer = { 1, 1, 2, 6, 24, 120 };
    for (int index = 0; index < answer.length; index++) {
      // if (answer[index] != factorial(index)) {
      // System.exit(1);
      // }
      assert factorial(index) == answer[index];
    }
    return;
  }

  public static void preCondition() {
    try {
      factorial(1);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    return;
  }

  public static void postCondition() {
    try {
      factorial(13);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (StackOverflowError s) {
      System.out.println(s.getMessage());
    }
    return;
  }

}
