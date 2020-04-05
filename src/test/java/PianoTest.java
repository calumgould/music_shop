import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("maple", "grand", "brown", "plink", 120.00, 250.00, 88);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("maple", piano.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("grand", piano.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void canGetSound(){
        assertEquals("plink", piano.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("plink", piano.play());
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(120.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(250.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(2500.00);
        assertEquals(2500.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(130.00, piano.calculateMarkup(), 0.01);
    }
}
