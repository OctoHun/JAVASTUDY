package practice;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Mathx {
  public static double reduce(BinaryOperation binaryOperation, double init,
      double... numbers) {
    return reduceIf(x -> true, binaryOperation, init, numbers);
  }

  public static double reduceIf(practice.Predicate predicate, BinaryOperation binaryOperation, double init,
      double... numbers) {
    double result = init;
    for (double number : numbers) {
      if (predicate.apply(number)) {
        result = binaryOperation.apply(result, number);
      }
    }
    return result;
  }

  // 유리수도 계산 되는 reduce
  public static <T> T reduce(BinaryOperator<T> binaryOperation, T init,
      T... numbers) {
    return reduceIf(x -> true, binaryOperation, init, numbers);
  }

  // 유리수도 계산이 되는 reduceIf
  public static <T> T reduceIf(java.util.function.Predicate<T> predicate,
      java.util.function.BinaryOperator<T> binaryOperation, T init,
      T... numbers) {
    T result = init;
    for (T number : numbers) {
      if (predicate.test(number)) {
        result = binaryOperation.apply(result, number);
      }
    }
    return result;
  }

  // private static double product(double... numbers) {
  // return reduce(new Multiply(), 1, numbers);
  // }

  // static double product(double... numbers) {
  // double result = 1;
  // for (double number: numbers) {
  // result *= number;
  // }
  // return result;
  // }

  public static int sum(int n) { // Overloading
    return n * (n + 1) / 2;
  }

  public static int sum(Range range) {
    return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
  }

  public static double sum(double... numbers) {
    return reduce(new Plus(), 0, numbers);
  }

  public static long gcd(long r1, long r2) {
    long temp = (r1 > r2 ? r2 : r1);
    for (long i = temp; i > 1; i--) {
      if (r1 % i == 0 && r2 % i == 0) {
        return i;
      }
    }
    return 1;
  }

}
