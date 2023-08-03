package mytest;

public class SumApp {
  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i=0; i<args.length; i++) {
      numbers[i] = Double.valueOf(args[i]);
    }
    System.out.println(Mathx.reduce(new Plus(), 0, numbers ));
    System.out.println(Mathx.reduce((x, y) -> x*y, 0, numbers));;
    System.out.println(Mathx.reduceIf(x -> x%2 == 0, (x, y) -> x*y, 0, numbers));;
  }
}
