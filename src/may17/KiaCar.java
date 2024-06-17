package may17;

public class KiaCar implements Car {

  @Override
  public String showEngine() {
    return "2.0L 4-실린더";
  }

  @Override
  public int amountNavi() {
    return 890000;
  }

  @Override
  public String getTier() {
    return "18인치";
  }

  public static void main(String[] args) {
    Car seltos = new KiaCar();
    System.out.println("타이어 = " + seltos.getTier());
    System.out.println("엔진 = " + seltos.showEngine());
    System.out.println("10.25인치 내비게이션 = " + seltos.amountNavi());
  }
}
