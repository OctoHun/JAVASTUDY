package regular;

public interface Expression {
  public static final Epsilon epsilon = Epsilon.value;

  // Epsilon에 정의하거나
  // public final static Epsilon EPSILON = new Epsilon();
  // 단, 이때 Epsilon을 private이 아니라 protected로 바꾸어줘야 함
  // 쓸 때는 Expression.EPSILON
  public default Expression or(Expression e) {
    return new Or(this, e);
  }

  public default Expression then(Expression e) {
    return new Then(this, e);
  }

  public default Expression star() {
    return new Star(this);
  }

  public default void accept(Visitor visitor);

}
