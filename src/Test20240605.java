import java.util.Random;
import java.util.Scanner;

public class Test20240605 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int targetNumber = random.nextInt(100) + 1;
    while (true) {
      System.out.print("(1 ~ 100): ");
      int num = scanner.nextInt();
      if (num == targetNumber) {
        System.out.println("정답!");
        break;
      } else if (num > targetNumber) {
        System.out.println("다운!");
      } else {
        System.out.println("업!");
      }
    }
    scanner.close();
  }
}
