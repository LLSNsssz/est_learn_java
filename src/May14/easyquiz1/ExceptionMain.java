package May14.easyquiz1;

import java.util.Scanner;

public class ExceptionMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int firstNum = scanner.nextInt();
      int secondNum = scanner.nextInt();
      Divide divide = new Divide();
      divide.divide(firstNum, secondNum);
      System.out.println("divide = " + divide);
    } catch (ArithmeticException e) {
      System.out.println("[오류]: " + e.getMessage());
    } finally {
      System.out.println("정상적으로 종료되었습니다.");
    }
  }
}
