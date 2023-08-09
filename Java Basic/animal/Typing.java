package animal;

interface Flyable {
}

interface Swimmable {
}

final class 비행기 implements Flyable {
}

final class FlyableBat extends 박쥐 implements Flyable {
}

final class 헤엄치고날으는펭귄 extends 펭귄 implements Flyable, Swimmable {
}

// Legacy code
abstract class 동물 {
  private boolean flyable;

  protected 동물(boolean flyable) {
    this.flyable = flyable;
  }

  public String type() {
    return Typing.type(this);
  }

  public boolean 날수있니() {
    return flyable;
  }
}

abstract class 새 extends 동물 {
  public 새(boolean flyable) {
    super(flyable);
  }
}

class 박쥐 extends 동물 {
  public 박쥐() {
    super(true);
  }
}

class 참새 extends 새 {
  참새() {
    super(true);
  }
}

class 펭귄 extends 새 {
  펭귄() {
    super(false);
  }
}

public class Typing {
  public final static String type(Object thing) {
    return thing.getClass().getSimpleName();
  }

  public static void 날수있니(동물 x) {
    System.out.println(x.type() + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못날아"));
  }

  public static void 날수있니(Flyable thing) {
    System.out.println(Typing.type(thing) + "는(은) 날 수 있어.");
  }

  public static void main(String[] args) {
    Flyable[] 날것들 = { new FlyableBat(), new 비행기() };
    Swimmable s = new 헤엄치고날으는펭귄();
    for (Flyable 날것 : 날것들) {
      Typing.날수있니(날것);
    }
  }
}
