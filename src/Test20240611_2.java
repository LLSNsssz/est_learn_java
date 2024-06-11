public class Test20240611_2 {
  public static void main(String[] args) {
    Test20240611_1 test1 = new Test20240611_1();
    Test20240611_1 test2 = new Test20240611_1();
    Test20240611_1 test3 = new Test20240611_1();

    System.out.println(test1.b);
    System.out.println(test1.good());

    Test20240611_1.call();
    System.out.println(args[0]);
  }
}
