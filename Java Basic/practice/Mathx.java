package practice;

public class Mathx {
  public static double reduce(BinaryOperation binaryOperation ,double init, double... numbers) {
    return reduceIf(x -> true, binaryOperation, init, numbers);
  }

  public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation ,double init, double... numbers) {
    double result = init;
    for (double number: numbers) {
      if (predicate.apply(number)) {
        result = binaryOperation.apply(result, number);
      }
    }
    return result;
  }

  // private static double product(double... numbers) {
  //   return reduce(new Multiply(), 1, numbers);
  // }
  
  // static double product(double... numbers) {
  //   double result = 1;
  //   for (double number: numbers) {
  //     result *= number;
  //   }
  //   return result;
  // }



  public static int sum(int n) { // Overloading
    return n*(n+1)/2;
  }

  public static double sum(double... numbers) {
    return reduce(new Plus(), 0, numbers);
  }
}
