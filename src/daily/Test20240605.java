package daily;

import java.util.Scanner;

public class Test20240605 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("영화 제목: ");
    String movieName = scanner.nextLine();
    System.out.print("관람 인원: ");
    int peopleNum = scanner.nextInt();
    System.out.print("예매자 이름: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    System.out.print("예매자 전화번호: ");
    String phoneNum = scanner.nextLine();
    int sum = 10000 * peopleNum;
    System.out.println(
        "영화 제목: "
            + movieName
            + "\n"
            + "관람 인원: "
            + peopleNum
            + "\n"
            + "예매자 이름: "
            + name
            + "\n"
            + "예매자 전화번호: "
            + phoneNum);
    System.out.print("총 결제 금액: " + sum);
    scanner.close();
  }
}
