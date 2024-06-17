package may17;

public class Apple implements Phone {

  @Override
  public String call() {
    return "아이폰이 전화를 겁니다.";
  }

  @Override
  public String answerThePhone() {
    return "아이폰이 전화를 받습니다.";
  }
}
