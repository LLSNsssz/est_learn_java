package daily;

public class testCar {
  private int speed;

  public void setSpeed(int speed) {
    this.speed = Math.max(speed, 0);
  }

  public int getSpeed() {
    return speed;
  }
}
