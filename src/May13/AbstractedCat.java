package May13;

public class AbstractedCat extends AbstractAnimal {

  public AbstractedCat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("냥");
  }
}
