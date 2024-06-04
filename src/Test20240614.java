import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {

    int num1 = 1;
    int num2 = 1;
    for (int i = 1; i <= 10; i++) {
      if (i >= 3) {
        int tmp = num1;
        num1 = num1 + num2;
        num2 = tmp;
        System.out.println(num1);
      } else {
        System.out.println(num1);
      }
    }

    int fib1 = 1;
    int fib2 = 1;
    for (int i = 0; i < 10; i += 2) {
      System.out.println(fib1);
      System.out.println(fib2);
      fib1 += fib2;
      fib2 += fib1;
    }

    Stream.iterate(new int[] {1, 1}, fib -> new int[] {fib[1], fib[0] + fib[1]})
        .limit(10)
        .map(fib -> fib[0])
        .forEach(System.out::println);
  }
}
