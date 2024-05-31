public class Test {

  public static void main(String[] args) {
    String firstName = "seung hee";
    String secondName = new String("seung hee");

    System.out.println(firstName == secondName);
    System.out.println(firstName.equals(secondName));
  }
}
