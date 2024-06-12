public class SeungJoFatMain {
  public static void main(String[] args) {
    SeongJo seongJo = new SeongJo(100, 5000);
    Food food = new Food("사탕", 50, 30);

    seongJo.buyFood(food);
    seongJo.buyFood(food);
    seongJo.buyFood(food);
    seongJo.eatFood(food);
    seongJo.eatFood(food);
    seongJo.eatFood(food);
    seongJo.eatFood(food);

    System.out.println(seongJo.money);
    System.out.println(seongJo.weight);
    System.out.println(seongJo.fat);
  }
}
