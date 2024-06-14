package May14;

public class ExceptionMain {
  public static void main(String[] args) {
    try {
      System.out.println(divde(10, 11414124));
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("정상적으로 종료되었습니다.");
    }
  }

  private static double divde(double a, double b) {
    if (a == 0 && b == 0) {
      throw new ArithmeticException();
    } else {
      return a / b;
    }
  }
}
