package May13;

abstract class AbstractPhone {
  private String owner;

  public AbstractPhone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰전원을 끕니다.");
  }
}
