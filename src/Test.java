public class Test {

  public static void main(String[] args) {
    String a =
        "Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! ";
    System.out.println(a.replaceAll("World", "Java"));

    System.out.println(a.replace("World", ""));
  }
}
