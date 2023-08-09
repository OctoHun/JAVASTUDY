package Visitor;

interface Top {
  public default void accept(Visitor v) {
    v.visit(this);
  }
}

// 왜 Top에 정의 되어있는데 Left와 Right에 따로 Override 해야 하는가?
// Single dispatch: 첫 번째 argument의 actual type을 보고 method를 찾아감.
// Top에서의 this는 Top이다. Left에서의 this는 Left, Right에서의 this는 Right
class Left implements Top {
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}

class Right implements Top {
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}

interface Visitor {
  default void visit(Top top) {
    throw new NoSuchMethodError();
  }

  void visit(Left left);

  void visit(Right right);
}

class 걸어 implements Visitor {
  public void visit(Left left) {
    System.out.println("왼쪽으로 걸어");
  };

  public void visit(Right right) {
    System.out.println("오른쪽으로 걸어");
  }
}

class 뛰어 implements Visitor {
  public void visit(Left left) {
    System.out.println("왼쪽으로 뛰어");
  };

  public void visit(Right right) {
    System.out.println("오른쪽으로 뛰어");
  }
}

public class 실험 {
  public static void main(String[] args) {
    Top leftTop = new Left();
    Top rightTop = new Right();
    leftTop.accept(new 걸어());
    rightTop.accept(new 뛰어());
  }
}
