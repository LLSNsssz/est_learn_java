public class Test {

  public static void main(String[] args) {
    String result = "";

    result += "Hello ";
    result += "java ";
    result += "World";

    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("java ");
    sb.append("World");
    System.out.println(sb); // sout이 toString()을 알아서 호출한다.

    StringBuffer sf = new StringBuffer();
    sf.append("Hello ");
    sf.append("java ");
    sf.append("World");
    System.out.println(sf);
  }
}
