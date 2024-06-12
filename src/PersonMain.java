public class PersonMain {
  public static void main(String[] args) {
    Person seungHee = new Person(32);

    seungHee.sayHello();
    seungHee.introduce();
    System.out.println(Person.GENDER);
    System.out.println("Person.PARTNER = " + Person.PARTNER);

    Person.say();
  }
}
