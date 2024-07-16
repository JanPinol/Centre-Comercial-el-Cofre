package persistence.shop;

import business.entities.Shop;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONShopDAO implements ShopDAO {
    private final Gson gson;
    private static final String FILENAME = "data/shop.json";

    public JSONShopDAO() {
        this.gson = new Gson();
    }

    @Override
    public ArrayList<Shop> readShopFile() throws FileNotFoundException{
        FileReader reader = new FileReader(FILENAME);
        Shop[] stores = gson.fromJson(reader, Shop[].class);

        return new ArrayList<>(Arrays.asList(stores));
    }

}
