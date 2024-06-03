public class Test20240603 {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;

    if (a > b) {
      System.out.println("a is greater than b.");
    } else if (a < b) {
      System.out.println("a is less than b.");
    } else {
      System.out.println("a and b are equal.");
    }

    System.out.println(
        a > b ? "a is greater than b." : a < b ? "a is less than b." : "a and b are equal.");
  }
}
