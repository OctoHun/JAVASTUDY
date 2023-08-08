package mytest;

public final class Bat implements Feed, IsFly {
  @Override
  public boolean canFly() {
    return true;
  }
}