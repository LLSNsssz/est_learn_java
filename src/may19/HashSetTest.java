package may19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    strings.add("Java");
    strings.add("Spring");
    strings.add("JPA");
    strings.add("Java");
    strings.add("DBMS");
    System.out.println(strings.size());
    strings.remove("Java");
    System.out.println(strings.size());

    for (String string : strings) {
      System.out.println("iterator = " + string);
    }

    if (strings.isEmpty()) {
      System.out.println("비었습니다.");
    } else {
      System.out.println("비지 않았습니다.");
    }
  }
}
