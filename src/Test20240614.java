import java.util.stream.IntStream;

public class Test20240614 {
  public static void main(String[] args) {

    int sum = 0, n = 20;
    for (int i = 0; i < n; i++) {
      if (i % 15 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
    sum = IntStream.rangeClosed(1, n).filter(i -> i % 15 == 0).sum();
    System.out.println(sum);
  }
}
