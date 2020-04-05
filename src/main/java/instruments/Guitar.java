package instruments;

public class Guitar extends Instrument {

    private String sound;
    private int numberOfStrings;

    public Guitar(String material, String type, String colour, String sound, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.sound = sound;
        this.numberOfStrings = numberOfStrings;
    }

    public String getSound() {
        return this.sound;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
