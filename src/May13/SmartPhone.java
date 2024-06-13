package May13;

public class SmartPhone extends AbstractPhone {

  public SmartPhone(String owner) {
    super(owner);
  }

  public void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }

  @Override
  public void turnOn() {

    super.turnOn();
  }

  @Override
  public void turnOff() {
    super.turnOff();
  }
}
