import java.util.Arrays;
import java.util.stream.Stream;

public class Fibo {
  public static void main(String[] args) {

    System.out.println("어레이피보나치");
    double[] fibArr = new double[100];
    fibArr[0] = 1;
    fibArr[1] = 1;
    System.out.println(fibArr[0]);
    System.out.println(fibArr[1]);

    for (int i = 2; i < fibArr.length; i++) {
      fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
      System.out.println(fibArr[i]);
    }
    System.out.println();

    System.out.println("스트림 피보나치");
    Stream.iterate(new double[] {1, 1}, fib -> new double[] {fib[1], fib[0] + fib[1]})
        .limit(100)
        .map(fib -> fib[0])
        .forEach(System.out::println);
    System.out.println();

    System.out.println("어레이메서드 피보나치");
    Arrays.parallelSetAll(fibArr, i -> (i < 2) ? i : fibArr[i - 1] + fibArr[i - 2]);
    System.out.println(Arrays.toString(fibArr));
  }
}
