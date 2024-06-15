package May14.quiz1;

import May14.quiz1.exception.AgeException;
import May14.quiz1.exception.NameException;

public class Person {
  private final String name;
  private final int age;
  private boolean nameError;
  private boolean ageError;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void getPerson() throws AgeException, NameException {
    if (ageError) {
      throw new AgeException(age + " is wrong age");
    }
    if (nameError) {
      throw new NameException("숫자가 들어가지 않은 이름을 적어주세요");
    }
    System.out.println(name + "씨의 나이는 " + age + "살 입니다.");
  }

  public void initPerson() {
    if (name.matches(".*\\[0-9]+.*")) {
      nameError = true;
    }
    if (age < 0) {
      ageError = true;
    }
  }
}
