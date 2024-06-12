package p1;

public class Test20240612 {
  public static void main(String[] args) {
    Person okay = new Person("okay", 25, 1000);
    okay.testMethod();
    System.out.println(okay.deposit(100000));
  }
}
