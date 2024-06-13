package May13;

public class ParentEx1 {
  protected int money = 0;

  public void deposit() {
    this.money += 10000;
  }

  public int getMoney() {
    return money;
  }
}
