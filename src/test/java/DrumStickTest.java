import items.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumstick;

    @Before
    public void before(){
        drumstick = new DrumStick("drumstick", "buy two", 8, 15);
    }

    @Test
    public void canGetType(){
        assertEquals("drumstick", drumstick.getType());
    }

    @Test
    public void canGetDescription(){
        assertEquals("buy two", drumstick.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(8, drumstick.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15, drumstick.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellPrice(){
        drumstick.setSellingPrice(13);
        assertEquals(13, drumstick.getSellingPrice(), 0.01);
    }

}
