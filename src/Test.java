public class Test implements TestInterFace {

  public static void main(String[] args) {
    boolean isTrue = false;

    if (isTrue) {
      System.out.println("이건 트루입니다.");
    } else {
      System.out.println("이건 펄스입니다.");
    }
  }

  @Override
  public void test() {}
}
