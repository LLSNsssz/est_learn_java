import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test20240610 {

  public static void main(String[] args) {
    //    3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
    //    하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
    //    기본적으로 중복되지 않는 숫자만 합산합니다.

    System.out.println(sumUnique(1, 2, 3)); // 6
    System.out.println(sumUnique(3, 2, 3)); // 2
    System.out.println(sumUnique(3, 3, 3)); // 0
  }

  public static int sumUnique(int a, int b, int c) {
    //    HashSet<Integer> set = new HashSet<>(Arrays.asList(a, b, c));
    //    ArrayList<Integer> list = new ArrayList<>(set);
    //    Collections.sort(list);
    //    if (set.size() == 3) return a + b + c;
    //    else if (set.size() == 2) return list.get(0);
    //    else return 0;
    if (a == b && b == c) return 0;
    if (a == b) return c;
    if (a == c) return b;
    if (b == c) return a;
    return a + b + c;
  }
}
