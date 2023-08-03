package mytest;

public class Mathx {
  public static double reduce(BinaryOperation binaryoperation, double init, double... numbers) {
    return reduceIf(x -> true, binaryoperation, init, numbers);
  }
  public static double reduceIf(Predicate predicate, BinaryOperation binaryoperation, double init, double... numbers) {
    double result = init;
    for (double number: numbers) {
      if (predicate.apply(number)) {
        result = binaryoperation.apply(result, number);
      }
    }
    return result;
  }
}
