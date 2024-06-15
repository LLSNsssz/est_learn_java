package weekly2.product;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {

  private final LocalDate expirationDate;

  public Food(String name, int price, int stock, LocalDate expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
    setPrice(calculatePrice());
  }

  @Override
  public int calculatePrice() {
    long between = ChronoUnit.DAYS.between(expirationDate, LocalDate.now());

    return between <= 7 ? (int) (getPrice() * 0.8) : getPrice();
  }

  @Override
  public void displayDetails() {
    System.out.println(
        "Product{"
            + "제품명='"
            + getName()
            + '\''
            + ", 가격="
            + getPrice()
            + ", 재고="
            + getStock()
            + ", 사이즈="
            + this.expirationDate
            + '}');
  }
}
