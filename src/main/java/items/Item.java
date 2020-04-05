package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private String type;
    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String type, String description, double buyingPrice, double sellingPrice){
        this.type = type;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double newSellPrice) {
        this.sellingPrice = newSellPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }


}
