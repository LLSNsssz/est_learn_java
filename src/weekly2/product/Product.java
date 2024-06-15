package weekly2.product;

public class Product {
  private String name;
  private int price;
  private int stock;

  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }

  public int calculatePrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void displayDetails() {
    System.out.println(
        "Product{" + "제품명='" + getName() + '\'' + ", 가격=" + getPrice() + ", 재고=" + getStock());
  }
}
