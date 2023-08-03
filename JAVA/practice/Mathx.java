package practice;

public class Mathx {
  private Mathx() {
  }

  public static int fibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("fibonacci: n < 0");
    }
    if (n == 0) {
      return 0; // base case 계산이 끝나는 지점
    } else if (n == 1) {
      return 1; // base case
    }
    return Math.addExact(fibonacci(n - 1), fibonacci(n - 2)); // recursion case
  }

  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("factorial: n < 0");
    }
    if (n == 0) {
      System.out.println("factorial(0) = 1");
      return 1;
    }
    System.out.println(n + " * factorial(" + (n - 1) + ")");
    int answer = Math.multiplyExact(factorial(n - 1), n);
    System.out.println(n + " * factorial(" + (n - 1) + ")");
    return answer;
  }

  public static int fibonacciFor(int n) {
    // int[] answer = new int[n];
    // answer[0] = 1;
    // answer[1] = 1;
    // for (int index = 2; index < n; index++) {
    // answer[index] = answer[index - 1] + answer[index - 2];
    // }
    // return answer[n - 1];

    int beforeOne = 1, beforeTwo = 1, answer = 0;
    for (int index = 2; index < n; index++) {
      answer = beforeOne + beforeTwo;
      beforeTwo = beforeOne;
      beforeOne = answer;
    }
    return answer;
  }
}