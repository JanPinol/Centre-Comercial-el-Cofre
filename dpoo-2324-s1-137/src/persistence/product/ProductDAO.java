package persistence.product;

import business.entities.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ProductDAO {
    ArrayList<Product> readProductsFile() throws FileNotFoundException;
}
