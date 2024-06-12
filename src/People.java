public class People {
  private String name;
  private int age;

  public People(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void giveDailyQuiz(People student) {
    System.out.println(this.name + "님이 " + getName() + "에게 Daily Quiz를 내줍니다.");
  }

  public void doDailyQuiz(String homework) {
    System.out.println(this.name + "이(가)" + homework + "를 합니다.");
  }
}
