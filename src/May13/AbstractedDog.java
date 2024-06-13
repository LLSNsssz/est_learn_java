package May13;

public class AbstractedDog extends AbstractAnimal {

  public AbstractedDog() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
