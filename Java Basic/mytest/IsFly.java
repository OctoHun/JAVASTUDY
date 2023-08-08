package mytest;

public interface IsFly extends Animal {
  default String isFly() {
    return this.getClass().getSimpleName();
  }
}
