package May14.easyquiz2;

import java.util.Scanner;

public class InputArrayMain extends ArrayIndexOutOfBoundsException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("배열의 크기를 정해주세요: ");
      int arrLength = scanner.nextInt();
      int[] nums = new int[arrLength];

      int idx = 0;

      while (true) {
        System.out.print(idx + "번 인덱스에" + "요소를 넣어주세요: ");
        int i = scanner.nextInt();
        nums[idx++] = i;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("[오류 메세지]: " + e.getMessage());
    } finally {
      System.out.println("스캐너 종료");
      scanner.close();
    }
  }
}
