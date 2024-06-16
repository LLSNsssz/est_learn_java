package weekly2.mall;

import java.time.LocalDate;
import weekly2.exception.InputProductException;
import weekly2.product.*;
import java.util.Scanner;
import java.util.Arrays;

/** 쇼핑몰의 기능이 담겨있는 추상클래스 입니다. 주요 기능으로는 상품추가, 상품제거, 상품목록표시가 있습니다. */
public abstract class ShoppingMall {
  // 상품을 저장하는 배열
  private Product[] products;
  // 초기 상품 개수
  public static final int INITIAL_PRODUCT_LENGTH = 2;
  // 현재 등록한 상품 개수
  private int count;
  // 상품 정보가 없는 경우 BLANK 표시
  private static final Product BLANK = new Product("상품정보를 입력해주세요", 0, 0);

  public Product[] getProducts() {
    return products;
  }

  public Product getBLANK() {
    return BLANK;
  }

  /**
   * 생성자
   *
   * @param productLength 쇼핑몰에서 관리할 상품의 초기 개수
   */
  public ShoppingMall(int productLength) {
    // 매개변수로 전달받은 크기의 배열을 생성하고 this.products 에 할당
    this.products = new Product[productLength];
    Arrays.fill(products, BLANK);
  }

  /**
   * 새로운 상품을 products 배열에 추가하는 메서드
   *
   * @param createdProduct 추가할 상품 객체
   */
  public void addProduct(Product createdProduct) {
    // products 배열이 가득 찼는지 확인합니다.
    // 배열이 가득 찼다면 expandProductArr() 메서드를 호출하여 배열의 크기를 확장
    if (count == products.length) expandProductArr();
    products[count++] = createdProduct;
  }

  /**
   * Product 추가를 위해 상품 정보를 입력받는 메서드
   *
   * @param productType cloth, electronics,food 이어야하고 대소문자를 구분하지 않습니다
   * @param scanner 스캐너를 사용하기위해 스캐너를 매개변수로 받음
   * @return 입력 받은 productType 에 따라 다른 객체를 반환합니다
   * @throws InputProductException 올바른 값이 입력되지 않았을때 예외처리
   */
  public Product createProduct(String productType, Scanner scanner) {

    if (!isValidProductType(productType)) {
      throw new InputProductException("올바른 상품 종류를 입력 하세요");
    } else {
      System.out.print("상품명: ");
      String name = scanner.nextLine().trim();

      int price = returnInt("가격: ", scanner);

      int stock = returnInt("재고: ", scanner);

      switch (productType.toLowerCase()) {
        case "cloth":
          System.out.print("사이즈(S ~ XXL): ");
          String size = scanner.nextLine().toUpperCase();
          return new Clothing(name, price, stock, size);

        case "electronics":
          System.out.print("브랜드: ");
          String brand = scanner.nextLine().trim();
          return new Electronics(name, price, stock, brand);

        case "food":
          System.out.print("유통기한(yyyy-MM-dd): ");
          LocalDate date = LocalDate.parse(scanner.nextLine().trim());
          return new Food(name, price, stock, date);

        default:
          throw new InputProductException("잘못된 타입입니다: " + productType);
      }
    }
  }

  /**
   * 입력받은 productType 유효성 검사
   *
   * @return cloth, electronics, food 중에 하나면 true
   */
  private boolean isValidProductType(String productType) {
    return productType.equalsIgnoreCase("cloth")
        || productType.equalsIgnoreCase("electronics")
        || productType.equalsIgnoreCase("food");
  }

  /**
   * 입력받은 값이 숫자인지 확인하는 메서드
   *
   * @param prompt 출력할 문자열
   * @param scanner 입력받을 값
   * @return 숫자를 입력하면 반환
   */
  private int returnInt(String prompt, Scanner scanner) {
    System.out.print(prompt);
    while (!scanner.hasNextInt()) {
      throw new InputProductException("숫자를 입력해주세요");
    }
    int value = scanner.nextInt();
    scanner.nextLine();
    return value;
  }

  /**
   * 상품을 삭제하는 메서드 입니다.
   *
   * @param productName 삭제할 상품의 이름
   */
  public void removeProduct(String productName) {
    /*
      매개변수로 전달받은 name 이 등록된 product 인지 확인합니다.
      포함되어 있지 않다면 "해당 상품은 존재하지 않습니다" 출력
    */

    boolean isProduct = false; // 상품이 존재하는지 확인
    int productIndex = 0; // 지워야할 인덱스
    for (int i = 0; i < products.length; i++) {
      // 배열에 동등한 이름이 존재한다면 isProduct 에 true, productIndex 에 i를 할당하고 이 반복문을 종료한다
      if (products[i].getName().equalsIgnoreCase(productName)) {
        isProduct = true;
        productIndex = i;
        break;
      }
    }
    if (!isProduct) {
      System.out.println("해당 상품은 존재하지 않습니다.");
    } else {
      for (int i = productIndex; i < products.length; i++) {
        if (i < products.length - 1) {
          // 현재 인덱스가 마지막 인덱스가 아닌경우
          // 다음 인덱스의 상품을 현재 인덱스로 이동
          products[i] = products[i + 1];
        } else {
          // 마지막 인덱스인 경우
          // 마지막으로 등록된 product 의 인덱스에 BLANK 할당
          products[count - 1] = BLANK;
          count--;
        }
      }
      System.out.println(productName + "이(가) 삭제되었습니다.");
      // 배열의 마지막요소를 BLANK 로 설정하고 count 를 1 감소
    }
  }

  /** products 배열을 순회하면서 product 의 정보를 출력합니다 */
  public void displayProduct() {
    for (Product product : products) {
      product.displayDetails();
    }
  }

  /** 상품 배열의 크기를 두배로 확장하는 메서드 기존 products 배열의 내용은 유지하면서 배열의 크기를 늘리고, 확장된 부분은 BLANK 상수로 초기화 */
  private void expandProductArr() {
    products = Arrays.copyOf(products, products.length * 2);
    // 기존 상품개수(count) 부터 확장된 배열의 끝까지 반복하면서 BLANK 할당
    for (int i = count; i < products.length; i++) {
      products[i] = BLANK;
    }
  }

  public abstract boolean checkOrderAvailability(Product product);
}
