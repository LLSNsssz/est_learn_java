package weekly2;

import java.util.Scanner;
import weekly2.mall.PremiumShoppingMall;
import weekly2.exception.InputProductException;
import weekly2.product.*;

public class ShoppingMallMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PremiumShoppingMall shoppingMall = new PremiumShoppingMall(2);

    while (true) {
      System.out.print("명령어를 입력하세요(add, remove, display, check, exit): ");
      String command = scanner.nextLine();

      try {
        switch (command) {
          case "add":
            System.out.print("상품 종류를 입력하세요(Cloth, Electronics, Food): ");
            String productType = scanner.nextLine();

            Product product = shoppingMall.createProduct(productType, scanner);
            shoppingMall.addProduct(product);

            break;

          case "remove":
            Product[] products = shoppingMall.getProducts();
            Product blank = shoppingMall.getBlank();
            if (products[0] == blank) {
              System.out.println("상품이 없습니다");
              continue;
            }

            System.out.print("상품명을 입력하세요: ");
            String productName = scanner.nextLine();
            shoppingMall.removeProduct(productName);
            break;

          case "display":
            shoppingMall.displayProduct();
            break;

          case "check":
            for (Product productValue : shoppingMall.getProducts()) {
              System.out.println(
                  productValue.getName()
                      + " 주문 가능 여부: "
                      + shoppingMall.checkOrderAvailability(productValue));
            }
            break;

          case "exit":
            return;
        }
      } catch (InputProductException e) {
        scanner.nextLine(); // 잘못된 입력 제거
        System.out.println(e.getMessage());
      }
    }
  }
}
