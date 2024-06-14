package May14;

public class BankApplication {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    try {
      bankAccount.withdraw(10000);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
