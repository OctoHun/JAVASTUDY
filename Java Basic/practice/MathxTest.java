package practice;

public class MathxTest {

  public static void main(String[] args) {
    // double[] numbers = new double[args.length];
    // for (int i=0; i<args.length; i++) {
    // numbers[i] = Double.valueOf(args[i]);
    // }
    // System.out.println(Mathx.reduce((x, y) -> x + y, 0, 1, 2, 3, 4));
    // System.out.println(Mathx.reduceIf(x -> x%2 == 0, (x, y) -> x * y, 1, 3, 4, 5,
    // 6, 123));
    MathxTest.range();
  }

  private static void range() {
    Range range = null;
    try {
      range = new Range(-2, -6);
    } catch (IllegalArgumentException e) {
      System.out.format(e.getMessage());
      System.exit(1);
    }
    System.out.format("%d %d 잘 넣음", range.getLowerBound(), range.getUpperBound());
    return;
  }
}