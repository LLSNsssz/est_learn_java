package daily;

public class exCar {
  private int speed;
  private int gear;

  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    }
    if (speed <= 30) {
      this.gear = 1;
    } else if (speed <= 70) {
      this.gear = 2;
    } else if (speed <= 120) {
      this.gear = 3;
    } else {
      System.out.println("과속!");
    }
  }

  public void getGear() {
    if (gear == 1) {
      System.out.println("기어 " + gear + "단");
    }
    if (gear == 2) {
      System.out.println("기어 " + gear + "단");
    }
    if (gear == 3) {
      System.out.println("기어 " + gear + "단");
    }
  }

  public int getSpeed() {
    return speed;
  }
}
