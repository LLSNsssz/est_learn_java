package may17.generic;

public class BoxTest {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.set("hello");

    String string = box.get();
  }
}
