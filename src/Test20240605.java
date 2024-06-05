import java.util.Scanner;

public class Test20240605 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("계절을 맞춰보세요!");
    System.out.print("숫자를 입력하세요(1 ~ 4): ");
    int a = scanner.nextInt();
    scanner.nextLine();
    switch (a) {
      case 1:
        System.out.println("봄 입니다");
        break;
      case 2:
        System.out.println("여름 입니다");
        break;
      case 3:
        System.out.println("가을 입니다");
        break;
      case 4:
        System.out.println("겨울 입니다");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }

    scanner.close();
  }
}
