package may19.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex2HashMap {
  public static void main(String[] args) {

    Map<Student, Integer> studentMap = new HashMap<>();
    studentMap.put(new Student(0, "이승희0"), 100);
    studentMap.put(new Student(1, "이승희1"), 90);
    studentMap.put(new Student(2, "이승희2"), 80);
    studentMap.put(new Student(0, "이승희0"), 100);
    System.out.println("studentMap = " + studentMap.size());

    Set<Entry<Student, Integer>> entries = studentMap.entrySet();
    System.out.println("entries = " + entries);
    for (Entry<Student, Integer> entry : entries) {
      Student key = entry.getKey();
      String value = String.valueOf(entry.getValue());
      System.out.println("key = " + key.getNo() + "번 " + key.getName() + ", value = " + value);
    }
  }
}
