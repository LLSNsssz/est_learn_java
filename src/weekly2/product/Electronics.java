package weekly2.product;

public class Electronics extends Product {

  private String brand;

  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
    setPrice(calculatePrice());
  }

  @Override
  public int calculatePrice() {
    return brand.equalsIgnoreCase("Apple") ? (int) (getPrice() * 1.2) : getPrice();
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
            + brand
            + '}');
  }
}
