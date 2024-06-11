public class Test20240611_1 {

  public static void call() {
    System.out.println("call");
  }

  private int a = 1;
  public String b = "hello";

  public String good() {
    add();

    return "okay";
  }

  private void add() {
    System.out.println("add");
  }
}
