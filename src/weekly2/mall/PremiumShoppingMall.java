package weekly2.mall;

import weekly2.product.Product;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int productLength) {
    super(productLength);
  }

  @Override
  public boolean checkOrderAvailability(Product product) {
    return product.getStock() >= 10;
  }
}
