package business.managers.product;

import java.io.FileNotFoundException;

public interface ProductFacade {
    void createProduct();

    void removeProduct();

    void readReviews();

    void reviewProduct();

    void readProductsFromFile() throws FileNotFoundException;

}
