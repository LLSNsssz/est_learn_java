public class Test20240610 {

  public static void main(String[] args) {
    // 주어진 문자열에서 모든 별표(*)와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
    // 예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.

    System.out.println(starSideDel("cd*zq")); // "cq"
    System.out.println(starSideDel("ab****cd")); // "ad"
    System.out.println(starSideDel("wacy***xko")); // "wacko"
  }

  public static String starSideDel(String str) {

    String string =
        str.substring(0, str.indexOf("*") - 1) + str.substring(str.lastIndexOf("*") + 2);
    return string;
  }
}
