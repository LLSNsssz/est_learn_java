package May13;

public class CalculatorMain {
  public static void main(String[] args) {
    int r = 10;

    Calculator calculator = new Calculator();
    System.out.println(calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원면적 " + computer.areaCircle(r));
    computer.say();
  }
}
