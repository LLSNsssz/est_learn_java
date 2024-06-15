package May14.quiz1;

import May14.quiz1.exception.AgeException;
import May14.quiz1.exception.NameException;
import java.util.Scanner;

public class ExceptionQuizMiddle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("이름을 입력해주세요: ");
    String name = scanner.nextLine();
    System.out.print("나이를 입력해 주세요: ");
    int age = scanner.nextInt();

    Person person = new Person(name, age);
    try {
      person.initPerson();
      person.getPerson();
    } catch (AgeException | NameException e) {
      System.out.println(e.getMessage());
    }
  }
}
