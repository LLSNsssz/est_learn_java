package weekly2;

import java.util.Scanner;
import weekly2.exception.InputProductException;
import weekly2.mall.*;
import weekly2.product.*;

public class ShoppingMallMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PremiumShoppingMall shoppingMall = new PremiumShoppingMall(ShoppingMall.INITIAL_PRODUCT_LENGTH);

    while (true) {
      System.out.println("=====================================================");
      System.out.print("명령어를 입력하세요(add, remove, display, check, exit): ");
      String command = scanner.nextLine().trim();

      try {
        switch (command) {
          case "add":
            System.out.println("=====================================================");
            System.out.print("상품 종류를 입력하세요(Cloth, Electronics, Food): ");
            String productType = scanner.nextLine().trim();
            System.out.println("=====================================================");
            // 입력받은 정보로 Product 객체 생성
            Product createdProduct = shoppingMall.createProduct(productType, scanner);
            // 생성된 Product 객체를 shoppingMall 의 products 배열에 추가
            shoppingMall.addProduct(createdProduct);
            shoppingMall.displayProduct();
            break;

          case "remove":
            Product[] products = shoppingMall.getProducts();
            Product blank = shoppingMall.getBLANK();
            // 상품이 등록되어 있지 않을 경우 반복처음으로 돌아감
            if (products[0] == blank) {
              System.out.println("상품이 없습니다");
              continue;
            }

            System.out.print("상품명을 입력하세요: ");
            String productName = scanner.nextLine();

            // 입력받은 상품명과 일치하는 상품을 shoppingMall 의 product 배열에서 제거
            shoppingMall.removeProduct(productName);
            shoppingMall.displayProduct();
            break;

          case "display":
            System.out.println("=====================================================");
            shoppingMall.displayProduct();
            break;

          case "check":
            // shoppingMall 의 배열을 순회하면서 10개 이상인지 true or false 반환
            for (Product productValue : shoppingMall.getProducts()) {
              System.out.println(
                  productValue.getName()
                      + " 주문 가능 여부: "
                      + shoppingMall.checkOrderAvailability(productValue));
            }
            break;

          case "exit":
            return;

          default:
            System.out.println("잘못된 입력 입니다.");
            break;
        }
      } catch (InputProductException e) {
        scanner.nextLine(); // 잘못된 입력 제거
        System.out.println(e.getMessage()); // shoppingMall 클래스에서 발생한 예외 처리
      } finally {
        scanner.close();
      }
    }
  }
}
