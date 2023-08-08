// package regular;

// public final class Then implements Expression {
//   private Expression left;
//   private Expression right;

//   public Then(Expression left, Expression right) {
//     this.left = left;
//     this.right = right;
//   }

//   public Expression getLeft() {
//     return left;
//   }

//   public Expression getRight() {
//     return right;
//   }

//   @Override
//   public String toString() {
//     return "(" + this.getLeft() + this.getRight() + ")";
//   }
// }

// BinaryOperation 추가
package regular;

public final class Then extends BinaryOperation implements Expression {

  public Then(Expression left, Expression right) {
    super(left, "", right);
  }

}