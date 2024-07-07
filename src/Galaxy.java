public class Galaxy implements Phone {

  @Override
  public void call() {
    System.out.println("갤럭시로 전화를 겁니다");
  }

  @Override
  public void name() {
    System.out.println("이것은 갤럭시 입니다");
    System.out.println();
  }

  @Override
  public void serial() {}
}
