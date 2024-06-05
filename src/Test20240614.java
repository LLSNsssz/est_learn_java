import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {

    String[] words = {"apple", "banana", "cherry", "durian"};
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
  }
}
