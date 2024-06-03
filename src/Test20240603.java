public class Test20240603 {
  public static void main(String[] args) {
    int x = 10;

    System.out.println(x > 0 ? "양수" : x < 0 ? "양수" : 0);

    int score = 75;

    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    int year = 2023;
    System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "윤년" : "평년");

    int a = 10;
    int b = 20;
    int c = 30;
    System.out.println(a > b ? a : b > c ? b : c);

    int passScore = 60;
    int myScore = 75;
    System.out.println(passScore > myScore ? "불합격" : "합격");
  }
}
