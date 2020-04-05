package instruments;

public class Clarinet extends Instrument {

    private String sound;
    private double length;

    public Clarinet(String material, String type, String colour, String sound, double buyingPrice, double sellingPrice, double length) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.sound = sound;
        this.length = length;
    }

    public String getSound() {
        return this.sound;
    }

    public double getLength(){
        return this.length;
    }
}
