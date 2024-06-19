package may19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {
  public static void main(String[] args) {
    Map<String, String> hashtable = new Hashtable<>();
    Scanner sc = new Scanner(System.in);

    hashtable.put("spring", "qwer");
    hashtable.put("summer", "qwer1234");
    hashtable.put("fall", "qwer123");
    hashtable.put("winter", "qwer123");

    while (true) {
      System.out.println("아이디와 비밀번호를 입력해주세요.");
      System.out.print("아이디: ");
      String id = sc.nextLine();

      System.out.print("비밀번호: ");
      String password = sc.nextLine();

      System.out.println("============================");

      if (hashtable.containsKey(id)) {
        String hashTablePassword = hashtable.get(id);
        if (hashTablePassword.equals(password)) {
          break;
        } else {
          System.out.println("입력하신 비밀번호가 올바르지 않습니다.");
        }
      } else {
        System.out.println("입력하신 아이디가 존재하지 않습니다.");
      }
    }
  }
}
