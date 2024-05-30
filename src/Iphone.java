public class Iphone implements Phone {

  @Override
  public void call() {
    System.out.println("아이폰으로 전화를 겁니다.");
  }

  @Override
  public void name() {
    System.out.println("이것은 아이폰입니다.");
  }
}
