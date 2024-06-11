public class Test20240611 {
  public static void main(String[] args) {
    int okay1 = okayPlus(1, 2);
    System.out.println("okay1 = " + okay1);
    int okay2 = okayMinus(1, 2);
    System.out.println("okay2 = " + okay2);
    int okay3 = okayMulti(1, 2);
    System.out.println("okay3 = " + okay3);
    int okay4 = okayDivide(1, 2);
    System.out.println("okay4 = " + okay4);
  }

  static int okayPlus(int a, int b) {
    return a + b;
  }

  static int okayMinus(int a, int b) {
    return a - b;
  }

  static int okayMulti(int a, int b) {
    return a * b;
  }

  static int okayDivide(int a, int b) {
    return a / b;
  }

  static void login(String email, String password) {}
}
