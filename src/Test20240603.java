public class Test20240603 {
  public static void main(String[] args) {
    int number = 10;

    if (number > 10) {
      System.out.println("number는 10보다 큽니다.");
    } else if (number < 10) {
      System.out.println("number는 10보다 작습니다.");
      if (number > 5) {
        System.out.println("number는 5보다 큽니다.");
      }
    } else {
      System.out.println("number는 10입니다.");
    }
  }
}
