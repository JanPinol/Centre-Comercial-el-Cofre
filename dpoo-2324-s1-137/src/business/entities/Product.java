package business.entities;

import java.util.ArrayList;

public class Product {
    private String name;
    private String brand;
    private float mrp;
    private String category;
    private ArrayList<String> reviews;

    public Product(String name, String brand, float mrp, String category) {
        this.name = name;
        this.brand = brand;
        this.mrp = mrp;
        this.category = category;
        this.reviews = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public float getMrp() {
        return mrp;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

}
