package practice;

@FunctionalInterface
public interface BinaryOperation {
  public double apply(double x, double y);
}

// class Stack<T> {
// public stack() {}
// public Stack push(T newElem) {}
// public Stack pop() {}
// public T top() {}
// }