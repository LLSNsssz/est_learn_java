public class Test20240603 {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    boolean z = true;

    if (x && y) {
      System.out.println("조건 1 충족");
    }
    if ((y && z) || (!x && !z)) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
