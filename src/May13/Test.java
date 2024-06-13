package May13;

public class Test {
  public static void main(String[] args) {
    InheritB inheritB = new InheritB(1, 2);

    inheritB.field1 = 100;
    inheritB.method1();

    inheritB.field2 = "필드2";
    inheritB.method2();
  }
}
