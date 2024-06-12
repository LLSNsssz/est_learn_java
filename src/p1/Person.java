package p1;

public class Person {

  private String name = "이승희";
  private int age;
  static final String GENDER = "남";
  static final String PARTNER = null;
  private int amount;

  public Person(String name, int age, int amount) {
    this.name = name;
    this.age = age;
    this.amount = amount;
  }

  private String checkAmount(int amount) {
    if (amount > this.amount) {
      return "요청하신 금액이 너무 큽니다.";
    }
    return "okay";
  }

  public String deposit(int amount) {

    return checkAmount(amount);
  }

  public String getName() {
    return this.name;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  public static void say() {
    System.out.println("good");
  }

  protected void testMethod() {
    System.out.println("test");
  }
}
