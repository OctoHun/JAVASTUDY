package mytest;

// public abstract interface
// abstract interface
// public interface
// interface
// 모두 같은 기능을 함
// 암묵적으로 public이고 암묵적으로 abstract이다.

// interface를 쓰는 이유?
/*  implementation이란 abstract barrier 밑의 모든 코드들인데 이것들이 없기때문에
 interface를 사용했다. */

interface Animal {
  default String type() {
    return this.getClass().getSimpleName();
  }

  default boolean canFly() {
    return false;
  }

  default boolean canSwim() {
    return false;
  }
}