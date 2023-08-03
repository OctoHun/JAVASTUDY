package practice;

public class MathxTest {

  public static void main(String[] args) {
    // MathxTest.fibonacciTest();
    MathxTest.factorialTest();
    // System.out.println(Mathx.factorial(3));
    System.out.println(Mathx.fibonacciFor(5));
  }

  private static void factorialTest() {
    FactorialTest.baseCase();
    FactorialTest.recursionCase();
    FactorialTest.preCondition();
    FactorialTest.postCondition();
  }

  public static void fibonacciTest() {
    FibonacciTest.baseCase();
    FibonacciTest.recursionCase();
    FibonacciTest.preCondition(); // require 사전조건 (Design-by )
    FibonacciTest.postCondition(); // satisfy 결과의 조건
  }

  // MathxTest() {} // default constructor
  // 자동으로 만들어지기 때문에 private을 써서 외부에서 쓸 수 없도록 막아야 한다.
  private MathxTest() {
  }
}
