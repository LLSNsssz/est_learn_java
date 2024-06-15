package weekly2.product;

public class Clothing extends Product {

  private String size;

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);
    this.size = size;
    setPrice(calculatePrice());
  }

  @Override
  public int calculatePrice() {
    return size.contains("L") ? (int) (getPrice() * 1.1) : getPrice();
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
            + size
            + '}');
  }
}
