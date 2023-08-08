package mytest;

public final class Sparrow implements Bird, IsFly {
  @Override
  public boolean canFly() {
    return true;
  }
}