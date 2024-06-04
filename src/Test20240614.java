public class Test20240614 {
  public static void main(String[] args) {
    int n = 100;
    int sum = 0;
    while (n > 0) {
      sum += n--;
    }
    System.out.println("sum = " + sum);
  }
}
