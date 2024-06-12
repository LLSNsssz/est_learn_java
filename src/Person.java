public class Person {

  private int age;
  static final String GENDER = "남";
  static final String NAME = "이승희";
  static final String PARTNER = null;

  public Person(int age) {
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + NAME);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  public static void say() {
    System.out.println("good");
  }
}
