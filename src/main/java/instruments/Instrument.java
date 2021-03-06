package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String type;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String type, String colour, double buyingPrice, double sellingPrice){
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }

    public String play() {
        return this.getSound();
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double newSellPrice){
        this.sellingPrice = newSellPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}