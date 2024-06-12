package daily;

public class exCar {
  private int speed = 100;

  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  public double getSpeed() {
    return speed * 1.6;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public String getWheel() {
    return wheel;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
