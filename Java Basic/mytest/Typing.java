package mytest;

// class Animal {
// }

// class Bat extends Animal {
// }

// class Sparrow extends Animal {
// }

// class Penguin extends Animal {
// }

public class Typing {
  // public static void canFly(Animal x) {
  // System.out.println(x.type() + (x.canFly() ? "는(은) 날 수 있어." : "는(은) 못날아."));
  // }

  public static void canFly(IsFly x) {
    System.out.println(x.type() + "는(은) 날 수 있어.");
  }

  public static void canSwim(Animal x) {
    System.out.println(x.type() + (x.canSwim() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄 못 쳐."));
  }
}