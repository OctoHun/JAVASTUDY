package regular;

public class Epsilon implements Expression {
  public static final Epsilon value = new Epsilon();

  private Epsilon() {
  } // Epsion은 상수이므로 new 해서 여러개 만들 필요가 없다.
    // 따라서 private으로 막아줌
    // 하지만 하나는 있어야 하므로 Epsilon 혹은 Expression에서 Epsilon을 하나는 만들어준다.

  @Override
  public String toString() {
    return "\u03B5";
  }
}
