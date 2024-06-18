package may17;

public class Tiger implements Predator {
  private String name = "tiga";

  @Override
  public String getFood() {
    return "feet meat";
  }

  public String getName() {
    return name;
  }
}
