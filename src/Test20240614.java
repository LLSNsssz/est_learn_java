import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {

    for (int i = 0; i >= -100; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    IntStream.rangeClosed(0, -100).filter(i -> i % 2 == 0).forEach(System.out::println);
  }
}
