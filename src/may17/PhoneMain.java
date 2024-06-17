package may17;

public class PhoneMain {
  public static void main(String[] args) {
    Phone apple = new Apple();
    System.out.println(apple.call());
    System.out.println(apple.answerThePhone());

    Samsung samsung = new Samsung();
    System.out.println(samsung.call());
    System.out.println(samsung.answerThePhone());
  }
}
