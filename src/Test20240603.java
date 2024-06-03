public class Test20240603 {
  public static void main(String[] args) {

    System.out.println("Hello" + 123 + 456);
    System.out.println(123 + 456 + "Hello");

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb);
  }
}
