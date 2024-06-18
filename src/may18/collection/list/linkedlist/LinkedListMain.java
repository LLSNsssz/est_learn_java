package may18.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    long startTime, endTime;

    System.out.println("add 시간 비교");
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린시간 = " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.add(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린시간 = " + (endTime - startTime));

    System.out.println("addFirst 시간 비교");
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.addFirst(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린시간 = " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.addFirst(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린시간 = " + (endTime - startTime));

    System.out.println("removeFirst 시간비교");
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.removeFirst();
    }
    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린시간 = " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.removeFirst();
    }
    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린시간 = " + (endTime - startTime));
  }
}
