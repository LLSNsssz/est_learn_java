package May13;

public class FamilyMain {
  public static void main(String[] args) {
    ChildEx1 ex1 = new ChildEx1();
    ex1.deposit();
    ex1.deposit();
    ex1.deposit();
    ex1.invest();
    ex1.invest();
    ex1.invest();
    System.out.println(ex1.getMoney());
  }
}
