package May13;

public class Animal1 {
  String name;
  String gender;

  public void setName(String name) {
    this.name = name;
  }

  public Animal1(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzzz...");
  }
}
