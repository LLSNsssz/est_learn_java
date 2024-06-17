package may17;

public interface InterfaceA {
  void methodA();

  default void methodA2() {
    System.out.println("methodA2");
  }
}
