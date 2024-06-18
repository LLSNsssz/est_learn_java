package may18.ex0;

public class Ex0Main {
  public static void main(String[] args) {
    System.out.println(compareString("a", "b"));
    System.out.println(compareString("a", "a"));
  }

  private static <T extends String> T compareString(T t1, T t2) {

    return (T) (t1.equals(t2) ? "okay" : "no");
  }
}
