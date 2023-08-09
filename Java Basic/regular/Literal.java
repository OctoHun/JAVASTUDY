package regular;

public final class Literal implements Expression {
  private char character;

  public Literal(char c) {
    this.character = c;
  }

  public char getCharacter() {
    return character;
  }

  // public Expression Then(Expression b) {
  // return new Then(this, b);
  // }

  // public Expression Or(Expression b) {
  // return new Or(this, b);
  // }

  // toString은 말그대로 문자 형식으로 바꾸어 주는 것. 반환 형식이 꼭 원형 그대로라는 보장은 없다.
  // @Override
  // public String toString() {
  // return String.valueOf(this.getCharacter());
  // }

  @Override
  public String literals() {
    return String.valueOf(getCharacter());
  }

}