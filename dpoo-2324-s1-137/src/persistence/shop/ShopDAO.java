package persistence.shop;

import business.entities.Shop;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ShopDAO {
    ArrayList<Shop> readShopFile() throws FileNotFoundException;
}
