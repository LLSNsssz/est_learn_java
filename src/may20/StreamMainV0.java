package may20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMainV0 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 2, 3, 4, 5));
    int[] array1 = list.stream().filter(i -> i % 2 != 0).mapToInt(i -> i * 2).sorted().toArray();
    System.out.println("array1 = " + Arrays.toString(array1));

    List<Integer> collect = list.stream().collect(Collectors.toList());
    System.out.println("collect = " + collect);
    int[] array = {1, 2, 3, 4, 5};
    IntStream stream = Arrays.stream(array);

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
  }
}
