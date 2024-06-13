package May13;

public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle메서드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    super.say();
    System.out.println("Computer.say");
  }
}
