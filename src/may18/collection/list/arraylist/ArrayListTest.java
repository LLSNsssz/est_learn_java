package may18.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("SPA");
    System.out.println("총 객체수: " + arrayList.size());

    System.out.println("==============================");
    System.out.println("두번째 인덱스" + arrayList.get(2));

    for (String string : arrayList) {
      System.out.println(string);
    }

    System.out.println("arrayList.contains(\"java\") = " + arrayList.contains("java"));

    ArrayList<Object> objects = new ArrayList<>();
    objects.add(null);
    System.out.println(objects.isEmpty());
    objects.clear();
    System.out.println("objects.isEmpty() = " + objects.isEmpty());
  }
}
