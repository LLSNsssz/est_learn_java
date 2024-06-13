package May13;

public class Dog1 extends Animal1 {

  int age;

  public Dog1(int age) {
    super("name", "male");
    this.age = age;
  }

  void sleep(int times) {
    System.out.println(name + " zzz..." + times + " hours");
  }
}
