package practice;

public class SumApp { // name space 역할만 함
  // sum :: int => int
  

  // 이 방법은 기존의 2개 숫자를 넣었을때 합이 나오는 로직을 바꾸기 때문에 안됨
  // static int sum(int min, int max) {
  //   return sum(max) - sum(min);
  // }

  // sum :: (int, int) => int
  // static double sum(double... numbers) {
  //   double result = 0;
  //   numbers[0] = 10;
  //   for (int i=0; i<numbers.length; i++) {
  //     result += numbers[i];
  //   }
  //   return result;
  // }


  public static void main(String[] args) {
    double[] numbers = new double[args.length];
    for (int i=0; i<args.length; i++) {
      numbers[i] = Double.valueOf(args[i]);
    }
    System.out.println(Mathx.sum(numbers));
    System.out.println(Mathx.sum(1, 2, 3, 4, 5)); // 내부적으로 array
    System.out.println(Mathx.sum(10) == Mathx.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(Mathx.reduce(
      new BinaryOperation() {
        public double apply(double x, double y) {
          return x + y;
        }
      }, 0, 1, 2, 3, 4));
    BinaryOperation plus = (x, y) -> x + y;
    System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4));
  }

  // public static void main(String[] args) {
  //   double[] numbers = new double[args.length];
  //   for (int i=0; i<args.length; i++) {
  //     numbers[i] = Double.valueOf(args[i]);
  //   }
  //   System.out.println(product(30, 10));
  //   System.out.println(product(numbers));
  //   System.out.println(product(4, 5, 6));
  //   System.out.println(product(3, 4, 5, 6, 123));
  //   System.out.println(reduce(new BinaryOperation() {
  //     public double apply(double x, double y) {
  //       return x * y;
  //     }
  //   }, 1, 4, 5, 6));
  //   System.out.println(reduce((x, y) -> x*y, 1, 4, 5, 6));
  //   BinaryOperation temp = (x, y) -> x*y;
  //   System.out.println(reduce(temp, 1, 4, 5, 6));
  // }
}