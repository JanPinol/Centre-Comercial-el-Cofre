package business.managers.shop;

import java.io.FileNotFoundException;

public interface ShopFacade {
    void createShop();

    void expandCatalogue();

    void reduceCatalogue();

    void readShopsFromFile() throws FileNotFoundException;

}
