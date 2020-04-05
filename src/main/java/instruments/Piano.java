package instruments;

public class Piano extends Instrument {

    private String sound;
    private int numberOfKeys;

    public Piano(String material, String type, String colour, String sound, double buyingPrice, double sellingPrice, int numberOfKeys) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.sound = sound;
        this.numberOfKeys = numberOfKeys;
    }

    public String getSound() {
        return this.sound;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }
}
