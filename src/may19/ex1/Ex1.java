package may19.ex1;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {
  public static void main(String[] args) {
    Set<Member> members = new HashSet<>();
    members.add(new Member("name", 30));
    members.add(new Member("name", 30));
    members.add(new Member("name", 30));
    members.add(new Member("name", 30));
    members.add(new Member("name", 30));
    members.add(new Member("name", 32));
    members.add(new Member("name", 31));

    System.out.println("총 객체수: " + members.size());
  }
}
