import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가와요");
    }
    if (!isRaining) {
      System.out.println("비가 안와요");
    }

    boolean isSunny = false;

    if (isSunny) {
      System.out.println("날씨가 맑아요");
    } else {
      System.out.println("날씨가 흐려요");
    }
  }
}
