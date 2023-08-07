// package regular;

// public final class Star implements Expression {
// private Expression expression;

// public Star(Expression expression) {
// this.expression = expression;
// }

// public Expression getExpression() {
// return expression;
// }

// @Override
// public String toString() {
// return "(" + this.getExpression() + ")*";
// }

// }

package regular;

public final class Star extends BinaryOperation {
  static Literal right = new Literal('*');

  public Star(Expression left) {
    super(left, "", right);
  }

}