package may19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
  public static void main(String[] args) {
    // 1. Map 컬렉션 생성
    Map<String, List<String>> map = new HashMap<>();

    List<String> stringList = new ArrayList<>();
    stringList.add("홍길동");
    stringList.add("홍밭동");
    stringList.add("홍논동");
    map.put("홍씨", stringList);
    List<String> linkedList = new LinkedList<>();
    linkedList.add("김길동");
    linkedList.add("김밭동");
    linkedList.add("김밭동");
    map.put("김씨", linkedList);

    Set<Entry<String, List<String>>> entries = map.entrySet();
    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println("key = " + key + ", value = " + value);
    }
  }
}
