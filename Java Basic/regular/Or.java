// package regular;

// public final class Or implements Expression {
//   @Override
//   public String toString() {
//     return "(" + this.getLeft() + "|" + this.getRight() + ")";
//   }

//   private Expression left;
//   private Expression right;

//   public Or(Expression left, Expression right) {
//     this.left = left;
//     this.right = right;
//   }

//   public Expression getLeft() {
//     return left;
//   }

//   public Expression getRight() {
//     return right;
//   }

// }

// BinaryOperation 추가
package regular;

public final class Or extends BinaryOperation implements Expression {

  public Or(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}