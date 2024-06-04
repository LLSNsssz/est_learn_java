import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test20240614 {
  public static void main(String[] args) {

    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    double average = (double) sum / scores.length;
    System.out.println("sum = " + sum);
    System.out.println("average = " + average);
  }
}
