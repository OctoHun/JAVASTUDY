package mytest;

public class Test {
  public static void main(String[] args) {
    Typing.canFly(new Sparrow());
    // Typing.canFly(new Penguin());
    Typing.canFly(new Bat());
    Typing.canSwim(new Sparrow());
    Typing.canSwim(new Penguin());
    Typing.canSwim(new Bat());
  }
}
