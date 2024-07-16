package presentation;

import business.managers.cart.CartFacade;
import business.managers.product.ProductFacade;
import business.managers.shop.ShopFacade;

import java.io.FileNotFoundException;

public class Controller {
    private ProductFacade productManager;
    private ShopFacade shopManager;
    private CartFacade cartManager;
    private Menu menu;

    public Controller(ProductFacade productManager, ShopFacade shopManager, CartFacade cartManager, Menu menu) {
        this.productManager = productManager;
        this.shopManager = shopManager;
        this.cartManager = cartManager;
        this.menu = menu;
    }

    public void run() {
        boolean stop;

        menu.showWelcome();

        menu.showMessage("\nVerifying local files...");
        try {
            productManager.readProductsFromFile();
            shopManager.readShopsFromFile();
            menu.showMessage("Starting program...");

        } catch (FileNotFoundException e) {
            menu.showMessage("\nError: The products.json file can’t be accessed");
            menu.showMessage("Shutting down...");
        }

        //print data





        do {
            menu.showMainMenu();

            int menuOption = menu.askForInteger("\nChoose a Digital Shopping Experience: ");
            stop = executeMenuOption(menuOption);

        } while (!stop);

    }

    private boolean executeMenuOption(int menuOption) {
        switch (menu.getSelectedMainMenuOption(menuOption)) {
            case MANAGE_PRODUCTS -> manageProducts();
            case MANAGE_SHOPS -> manageShops();
            case SEARCH_PRODUCTS -> searchProducts();
            case LIST_SHOPS -> listShops();
            case YOUR_CART -> yourCart();
            case EXIT -> {
                menu.showGoodbye();
                return true;
            }
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;

    }


    private void manageProducts() {
        boolean stop;

        do {
            menu.showManageProductsMenu();

            int menuOption = menu.askForInteger("\nChoose an option: ");
            stop = executeManageProductsMenuOption(menuOption);

        } while (!stop);
    }

    private boolean executeManageProductsMenuOption(int menuOption) {
        switch (menu.getSelectedManageProductsMenuOption(menuOption)) {
            case CREATE_PRODUCT -> productManager.createProduct();
            case REMOVE_PRODUCT -> productManager.removeProduct();
            case BACK -> {
                return true;
            }
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;
    }

    private void manageShops() {
        boolean stop;

        do {
            menu.showManageShopMenu();

            int menuOption = menu.askForInteger("\nChoose an option: ");
            stop = executeManageShopMenuOption(menuOption);

        } while (!stop);


    }

    private boolean executeManageShopMenuOption(int menuOption) {
        switch (menu.getSelectedManageShopsMenuOption(menuOption)) {
            case CREATE_SHOP -> shopManager.createShop();
            case EXPAND_CATALOGUE -> shopManager.expandCatalogue();
            case REDUCE_CATALOGUE -> shopManager.reduceCatalogue();
            case BACK -> {
                return true;
            }
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;

    }

    private void searchProducts() {
        boolean stop;

        //enter query

        do {
            menu.showSearchProductsMenu();

            int menuOption = menu.askForInteger("\nChoose an option: ");
            stop = executeSearchProductsMenuOption(menuOption);

        } while (!stop);

    }

    private boolean executeSearchProductsMenuOption(int menuOption) {
        switch (menu.getSelectedSearchProductsMenuOption(menuOption)) {
            case READ_REVIEWS -> productManager.readReviews();
            case REVIEW_PRODUCT -> productManager.reviewProduct();
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;
    }

    private void listShops() {
        boolean stop;

        //List shops
        //Which catalogue do you want to see?

        do {
            menu.showListShopsMenu();

            int menuOption = menu.askForInteger("\nChoose an option: ");
            stop = executeListShopsMenuOption(menuOption);

        } while (!stop);

    }

    private boolean executeListShopsMenuOption(int menuOption) {
        switch (menu.getSelectedListShopsMenuOption(menuOption)) {
            case READ_REVIEWS -> productManager.readReviews();
            case REVIEW_PRODUCT -> productManager.reviewProduct();
            case ADD_TO_CART -> cartManager.addProductToCart();
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;
    }

    private void yourCart() {
        boolean stop;

        //List products in cart

        do {
            menu.showYourCartMenu();

            int menuOption = menu.askForInteger("\nChoose an option: ");
            stop = executeYourCartMenuOption(menuOption);

        } while (!stop);
    }

    private boolean executeYourCartMenuOption(int menuOption) {
        switch (menu.getSelectedYourCartMenuOption(menuOption)) {
            case CHECKOUT -> cartManager.checkoutCart();
            case CLEAR_CART -> cartManager.clearCart();
            case BACK -> {
                return true;
            }
            default -> menu.showMessage("\nError: Select a valid option.");
        }

        return false;
    }

}
