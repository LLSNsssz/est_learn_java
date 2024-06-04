import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {

    for (int i = 0; i < 11; i++) {
      if (i == 4 || i == 7) continue;
      System.out.println(i);
    }
  }
}
