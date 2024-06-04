import java.util.stream.IntStream;

public class Test20240614 {
  public static void main(String[] args) {
    int[] number = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int i = 0, sumNegative = 0, sumPositive = 0;
    while (i < number.length) {
      if (number[i] > 0) {
        sumPositive += number[i++];
      } else if (number[i] < 0) {
        sumNegative += number[i++];
      }
    }
    System.out.println("sumNegative = " + sumNegative);
    System.out.println("sumPositive = " + sumPositive);
  }
}
