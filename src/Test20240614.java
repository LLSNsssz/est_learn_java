import java.util.stream.IntStream;

public class Test20240614 {
  public static void main(String[] args) {
    int[] number = {10, 5, 8, 20, 3, 15, 9, 2};
    int i = 0, j = 0, max = 0, min = Integer.MAX_VALUE;
    while (i < number.length) {
      max = number[i] > max ? number[i] : max;
      i++;
    }
    System.out.println(max);

    while (j < number.length) {
      min = number[j] < min ? number[j] : min;
      j++;
    }
    System.out.println(min);
  }
}
