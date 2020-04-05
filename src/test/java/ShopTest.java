import instruments.Drum;
import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import items.DrumStick;
import items.GuitarString;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    
    Shop shop;
    Item item1;
    Item item2;
    Instrument instrument1;
    Instrument instrument2;
    Instrument instrument3;
    
    @Before
    public void before(){
        item1 = new DrumStick("strong", "excellent drumstricks, store favourite", 10, 15);
        item2 = new GuitarString("flexible", "length may vary dramatically", 20, 30);
        instrument1 = new Guitar("steel", "unique", "red", "striiift", 500.00, 750.00, 8);
        instrument2 = new Piano ("maple", "grand", "brown", "plink", 84000, 97000, 88);
        instrument3 = new Drum("pine", "acoustic", "silver", "boom", 1500.00, 3200.00, "enormous");
        shop = new Shop();
        shop.addItem(item1);
        shop.addItem(instrument2);
    }
    
    @Test
    public void ShopStartsWithStock(){
        assertEquals(2, shop.getAmountOfStock());
    }

    @Test
    public void canAddItem(){
        shop.addItem(instrument3);
        assertEquals(3, shop.getAmountOfStock());
    }

    @Test
    public void canRemoveItem(){
        shop.removeItem(item1);
        assertEquals(1, shop.getAmountOfStock());
    }

    @Test
    public void canGetTotalPotentialProfit(){
        assertEquals(13005, shop.calculateTotalPotentialProfit(), 0.01);
    }

}
