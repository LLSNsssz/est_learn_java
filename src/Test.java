import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x));
    System.out.println("후위 증가 연산자: " + (y++));

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
  }
}
