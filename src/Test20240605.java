import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test20240605 {
  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    Random random = new Random();

    while (set.size() < 6) {
      int num = random.nextInt(45) + 1;
      set.add(num);
    }

    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list);

    System.out.println(list);
  }
}
