package practice;

// Abstraction barrier
public final class Range {
  private int i;
  private int j;

  public Range(int i, int j) {
    this.i = i;
    this.j = j;
    classInvariant();
  }

  private void classInvariant() {
    if (getLowerBound() > getUpperBound()) {
      throw new IllegalArgumentException("Range: lower bound " + i + "가 upper bound " + j + "보다 큼%n");
    }
  }

  public int getUpperBound() { // selector => In java: getter
    return j;
  }

  public int getLowerBound() {
    return i;
  }

  public void lowerBound() {
    assert true;
  }

  public void upperBound() {
    assert true;
  }
}