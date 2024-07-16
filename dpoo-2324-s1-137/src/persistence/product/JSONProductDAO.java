package persistence.product;

import business.entities.Product;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONProductDAO implements ProductDAO {
    private final Gson gson;
    private static final String FILENAME = "data/product.json";

    public JSONProductDAO() {
        this.gson = new Gson();
    }

    public ArrayList<Product> readProductsFile() throws FileNotFoundException {
        FileReader reader = new FileReader(FILENAME);
        Product[] products = gson.fromJson(reader, Product[].class);

        return new ArrayList<>(Arrays.asList(products));
    }
}
