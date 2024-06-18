package may17;

public interface Predator {
  String getFood();

  default void PredatorMethod(String predator) {
    System.out.println(predator + "PredatorMethod 실행");
  }
}
