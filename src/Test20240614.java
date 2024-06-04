import java.util.Arrays;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {
    for (int i = 19; i >= 2; i--) {
      for (int j = 19; j >= 1; j--) {
        System.out.println(i + "x" + j + "=" + i * j);
      }
    }
  }
}
