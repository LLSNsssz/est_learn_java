package May13;

public class Test2 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("도그");
    // 오버로딩
    dog.sleep();
    dog.sleep(2);

    Dog1 dog1 = new Dog1(23);
    dog1.setName("그그도도");
  }
}
