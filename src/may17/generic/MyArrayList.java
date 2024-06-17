package may17.generic;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
  public static void main(String[] args) {
    List<Animal> stringArrayList = new ArrayList<>();
    stringArrayList.add(new Lion());

    List<String> animalList = new ArrayList<>();
    String string = animalList.get(0);
  }
}
