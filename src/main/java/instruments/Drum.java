package instruments;

public class Drum extends Instrument {

    private String sound;
    private String size;

    public Drum(String material, String type, String colour, String sound, double buyingPrice, double sellingPrice, String size) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.sound = sound;
        this.size = size;
    }

    public String getSound() {
        return this.sound;
    }

    public String getSize() {
        return this.size;
    }
}
