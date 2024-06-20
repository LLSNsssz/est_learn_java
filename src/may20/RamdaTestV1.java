package may20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RamdaTestV1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("list = " + list);

    list.removeIf(i -> i % 2 == 0);
    System.out.println("list = " + list);

    //    Iterator<Integer> iterator = list.iterator();
    //
    //    while (iterator.hasNext()) {
    //      Integer next = iterator.next();
    //      if (next % 2 == 0) {
    //        iterator.remove();
    //      }
    //    }
    //    System.out.println(list);
  }
}
