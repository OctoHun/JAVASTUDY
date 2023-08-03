package mytest;

public class MultipleApp {
  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i=0; i<args.length; i++) {
      numbers[i] = Double.valueOf(args[i]);
    }
    System.out.println(Mathx.reduce(new Multi(), 1, numbers));
    System.out.println(Mathx.reduce((x, y) -> x * y, 1, numbers));
    System.out.println(Mathx.reduceIf(x -> x%2 == 0, (x, y) -> x * y, 1, numbers));
  }
}
