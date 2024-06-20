package may20.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
  public static void main(String[] args) {
    List<Integer> collect =
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toList());
    System.out.println("collectList = " + collect);

    List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
    List<Integer> list = words.stream().map(String::length).toList();
    System.out.println("listStringLength = " + list);

    String sentence = "Java Stream API Example";
    long count = Stream.of(sentence.split(" ")).count();
    System.out.println("count = " + count);
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    numbers.removeIf(i -> i % 2 == 0);
    System.out.println("numbers = " + numbers);

    numbers.stream().filter(i -> i % 2 != 0).forEach(System.out::println);

    words.stream().filter(i -> i.length() <= 5).forEach(System.out::println);
  }
}
