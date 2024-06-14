package May14.easyquiz1;

public class Divide {

  public int divide(int firstNum, int secondNum) {
    if (secondNum == 0) {
      throw new ArithmeticException("error");
    } else {
      return firstNum / secondNum;
    }
  }
}
