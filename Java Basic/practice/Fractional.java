package practice;

// How to design type
// 1. primitive operations to define a (data) type (set)
//    - ADT(abstraction data type, where primitives) = abstraction barrier
// 2. combinations (combinational operations) e.g) add, multipy...

public class Fractional extends Number {
  // private int[] rep;
  private long numerator;
  private long denominator;

  // 아래3개 Abstraction barrier
  public Fractional(long numerator, long denominator) { // constructor
    if (denominator == 0)
      throw new IllegalArgumentException("분모가 0이야! 다시");
    // normalize(rep); // 기약분수로 만듬
    this.numerator = numerator;
    this.denominator = denominator;
    normalize();
    classInvariant(); // 만들어진 유리수가 기약분수인지 확인
  }

  public long getNumerator() { // 분자 돌려줌 getter
    // normalize(r);
    return this.numerator;
  }

  public long getDenominator() { // 분모 돌려줌 getter
    // normalize(r);
    return this.denominator;
  }

  private void classInvariant() {
    long temp = (this.getNumerator() < this.getDenominator() ? this.getNumerator() : this.getDenominator());
    for (long i = temp; i > 1; i--) {
      if (this.getNumerator() % i == 0 && this.getDenominator() % i == 0) {
        throw new IllegalArgumentException("기약분수가 아님");
      }
    }
  }

  public Fractional add(Fractional r) {
    return new Fractional(this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator(),
        this.getDenominator() * r.getDenominator());
  }

  @Override
  public String toString() {
    return this.getNumerator() + "/" + this.getDenominator();
  }

  private void normalize() {
    long g = Mathx.gcd(this.numerator, this.denominator);
    this.numerator /= g;
    this.denominator /= g;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (int) (prime * result + this.getNumerator());
    result = (int) (prime * result + this.getDenominator());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (getClass() != obj.getClass())
      return false;
    Fractional other = (Fractional) obj;
    return this.equals(other);
  }

  public boolean equals(Fractional that) {
    if (this == that)
      return true;
    if (that == null)
      return false;
    return this.getNumerator() == that.getNumerator() && this.getDenominator() == that.getDenominator();
  }

  @Override
  public int intValue() {
    return (int) (this.longValue());
  }

  @Override
  public long longValue() {
    return (long) (this.getNumerator() / this.getDenominator());
  }

  @Override
  public float floatValue() {
    return (float) (this.doubleValue());
  }

  @Override
  public double doubleValue() {
    return (double) this.getNumerator() / (double) this.getDenominator();
  }
}
