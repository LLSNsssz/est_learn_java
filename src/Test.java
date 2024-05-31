import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    int positive = 10;
    int negative = -10;
    System.out.println("양의 부호 연산자 적용: " + (+positive));
    System.out.println("음의 부호 연산자 적용: " + (-positive));
    System.out.println("양의 부호 연산자로 부호 반전: " + (+negative));
    System.out.println("음의 부호 연산자로 부호 반전: " + (-negative));
  }
}
