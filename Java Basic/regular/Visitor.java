package regular;

import usecases.Literals;

public interface Visitor {
  public void visit(Epsilon e);

  public void visit(Literals e);

  public void visit(Then e);

  public void visit(Or e);

  public void visit(Star e);
}
