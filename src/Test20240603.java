public class Test20240603 {
  public static void main(String[] args) {
    int score = 95;
    //    String grade = (score > 90) && (score % 5 == 0) ? "Good" : "Bad";

    if ((score > 90) && (score % 5 == 0)) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
  }
}
