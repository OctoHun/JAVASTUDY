package practice;

import static practice.Mathx.*;

public class FibonacciTest {

  public static void baseCase() {
    if (fibonacci(0) == 0 && fibonacci(1) == 1) {
      return;
    }
    System.exit(1);
  }

  public static void recursionCase() {
    int[] answers = {0, 1, 1, 2, 3, 5};
    for (int index = 0; index<answers.length; index++) {
      if (answers[index] != fibonacci(index)) {
        System.exit(1);
      }
    }
    return;
  }

  public static void preCondition() {
    try {
      fibonacci(0);
    }
    catch (IllegalArgumentException e) {
      System.out.println("n is too small");
    }
    return;
  }

  public static void postCondition() {
    try {
      fibonacci(100);
    } catch (ArithmeticException e) {
      return;
    } catch (StackOverflowError s) {
      System.out.println("n is too big");
    }
    return;
  } 
}
