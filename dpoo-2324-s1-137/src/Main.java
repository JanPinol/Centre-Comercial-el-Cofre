import business.managers.cart.CartFacade;
import business.managers.cart.CartManager;
import business.managers.product.ProductFacade;
import business.managers.product.ProductManager;
import business.managers.shop.ShopFacade;
import business.managers.shop.ShopManager;
import presentation.Controller;
import presentation.Menu;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        ProductFacade productManager = new ProductManager();
        ShopFacade storeManager = new ShopManager();
        CartFacade cartManager = new CartManager();

        Controller controller = new Controller(productManager, storeManager, cartManager, menu);

        controller.run();

    }
}
