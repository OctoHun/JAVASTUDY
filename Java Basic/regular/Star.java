package regular;

public final class Star implements Expression {
  private Expression expression;

  public Star(Expression expression) {
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}

// package regular;

// public final class Star extends BinaryOperation implements Expression {
// static Literal right = new Literal('*');

// public Star(Expression left) {
// super(left, "", right);
// }

// @Override
// public String literals() {
// return this.getExpression().literals();
// }

// }