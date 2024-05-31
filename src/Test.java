import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x));
    System.out.println("후위 증가 연산자: " + (y++));

    System.out.println("=========================");

    System.out.println(x);
    System.out.println(y);
  }
}
