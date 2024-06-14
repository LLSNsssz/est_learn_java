package May14.quiz1;

import java.util.Scanner;

public class ExceptionQuizMiddle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int age = scanner.nextInt();

    try {
      System.out.println("Person 객체 생성");
      Person person = new Person(name, age);
      System.out.println("getPerson");
      person.getPerson();
    } catch (InvalidAgeException e) {
      System.out.println("[오류]: " + e.getMessage());
    } finally {
      System.out.println("출력 종료");
    }
  }
}
