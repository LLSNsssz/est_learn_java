package May14.quiz1;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void getPerson() throws InvalidAgeException {
    if (age < 0) {
      throw new InvalidAgeException(age, age + " is wronge age");
    }
    System.out.println(name + "씨의 나이는 " + age + "살 입니다.");
  }
}
