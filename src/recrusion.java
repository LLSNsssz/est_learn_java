public class recrusion {
  private static String printAt(String str) {
    //    if (str.length() <= 1) {
    //      return str;
    //    }
    //    return str.charAt(0) + "@" + printAt(str.substring(1));
    int i = 0;
    String result = "";
    while (i < str.length() - 1) {
      result += str.charAt(i) + "@";
      i++;
    }
    return result + (str.charAt(str.length() - 1) + "");
  }

  public static void main(String[] args) {
    System.out.println(printAt("HelloWorld"));
  }
}
