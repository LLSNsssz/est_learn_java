package may18.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("홍길동1");
    arrayList.add(1, "홍길동2");
    String s = arrayList.get(0);
    arrayList.add("홍길동3");
    arrayList.add("홍길동4");
    arrayList.add("홍길동5");
    arrayList.add("홍길동6");
    arrayList.add("홍길동7");
    arrayList.add("홍길동8");
    arrayList.add("홍길동9");
    arrayList.add("홍길동10");

    arrayList.removeIf(i -> i.contains("3"));

    for (String string : arrayList) {
      System.out.println(string);
    }
  }
}
