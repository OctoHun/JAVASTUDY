package regular;

class BinaryOperation {

  private Expression left;
  private Expression right;
  private String operator;

  // protected로 주는 이유?
  // package scope(family scope) => subclass만 super를 사용해 접근할 수 있다.
  protected BinaryOperation(Expression left, String operator, Expression right) {
    this.left = left;
    this.right = right;
    this.operator = operator;
  }

  @Override
  public String toString() {
    return "(" + this.getLeft() + getOperator() + this.getRight() + ")";
  }

  private String getOperator() {
    return this.operator;
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }

}
