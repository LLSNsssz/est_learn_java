import java.util.stream.IntStream;

public class Test20240614 {
  public static void main(String[] args) {

    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) sum += i;
    }
    System.out.println("sum = " + sum);

    sum = IntStream.range(0, 101).filter(i -> i % 2 == 0).sum();
    System.out.println("sum = " + sum);
  }
}
