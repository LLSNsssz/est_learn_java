package May13;

public class InheritA {
  int field1;

  public InheritA(int field1, int s1) {
    this.field1 = field1;
  }

  void method1() {
    System.out.println("InheritA.method1 field1 = " + field1);
  }

  private void method3() {
    System.out.println("이것은 프라이빗");
  }
}
