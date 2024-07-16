package business.entities;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int since;
    private float earnings;
    private String businessModel;
    private ArrayList<Product> catalogue;

    public Shop(String name, String description, int since, float earnings, String businessModel) {
        this.name = name;
        this.description = description;
        this.since = since;
        this.earnings = earnings;
        this.businessModel = businessModel;
        this.catalogue = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSince() {
        return since;
    }

    public float getEarnings() {
        return earnings;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public ArrayList<Product> getCatalogue() {
        return catalogue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public void setEarnings(float earnings) {
        this.earnings = earnings;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public void setCatalogue(ArrayList<Product> catalogue) {
        this.catalogue = catalogue;
    }

}
