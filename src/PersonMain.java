import p1.Person;

public class PersonMain {
  public static void main(String[] args) {
    Person seungHee = new Person("tmm", 32, 100000);

    seungHee.sayHello();
    seungHee.introduce();

    Person.say();
  }
}
