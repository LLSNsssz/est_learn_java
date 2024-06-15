package weekly2.mall;

import weekly2.exception.InputProductException;
import weekly2.product.*;
import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;

public abstract class ShoppingMall {
  private Product[] products;
  private int count;
  private final Product blank = new Product("빈칸", 0, 0);

  public Product[] getProducts() {
    return products;
  }

  public Product getBlank() {
    return blank;
  }

  public ShoppingMall(int productLength) {
    this.products = new Product[productLength];
    Arrays.fill(products, blank);
    this.count = 0;
  }

  public void addProduct(Product product) {
    if (count == products.length) expandProductArr();
    products[count++] = product;
  }

  public Product createProduct(String productType, Scanner scanner) throws InputProductException {
    System.out.print("상품명: ");
    String name = scanner.nextLine();
    System.out.print("가격: ");
    if (!scanner.hasNextInt()) {
      throw new InputProductException("올바른 값을 입력해주세요");
    }
    int price = scanner.nextInt();
    scanner.nextLine();
    System.out.print("재고: ");
    int stock = scanner.nextInt();
    scanner.nextLine();

    if (productType.equals("옷") || productType.equalsIgnoreCase("cloth")) {
      System.out.print("사이즈: ");
      String size = scanner.nextLine();
      return new Clothing(name, price, stock, size);
    } else if (productType.equals("전자제품") || productType.equalsIgnoreCase("electronics")) {
      System.out.print("브랜드: ");
      String brand = scanner.nextLine();
      return new Electronics(name, price, stock, brand);
    } else if (productType.equals("음식") || productType.equalsIgnoreCase("food")) {
      System.out.print("유통기한(yyyy-MM-dd): ");
      LocalDate date = LocalDate.parse(scanner.nextLine());
      return new Food(name, price, stock, date);
    } else {
      throw new InputProductException("잘못된 타입입니다: " + productType);
    }
  }

  public void removeProduct(String name) {
    if (!Arrays.toString(this.products).contains(name)) {
      System.out.println("해당 상품은 존재하지 않습니다.");
    } else {
      for (int i = 0; i < count; i++) {
        if (products[i].getName().equals(name)) {
          products[i] = products[i + 1];
        }
      }
      System.out.println(name + "이(가) 삭제되었습니다.");
      products[count--] = blank;
    }
  }

  public void displayProduct() {
    for (Product product : products) {
      product.displayDetails();
    }
  }

  private void expandProductArr() {
    products = Arrays.copyOf(products, products.length * 2);
    for (int i = count + 1; i < products.length; i++) {
      products[i] = blank;
    }
  }

  public abstract boolean checkOrderAvailability(Product product);
}
