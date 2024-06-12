public class PeopleMain {
  public static void main(String[] args) {
    People seunghee = new People("이승희", 32);
    People seungJo = new People("김승주", 20);

    seungJo.giveDailyQuiz(seunghee);
    seunghee.doDailyQuiz("DailyQuiz");
  }
}
