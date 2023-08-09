package regular;

class BinaryOperation {

  private Expression left;
  private Expression right;

  // protected로 주는 이유?
  // package scope(family scope) => subclass만 super를 사용해 접근할 수 있다.
  protected BinaryOperation(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }
}