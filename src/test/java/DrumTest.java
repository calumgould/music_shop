import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("wood", "set", "black", "badump", 290.99, 439.00, "large");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", drum.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("set", drum.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", drum.getColour());
    }

    @Test
    public void canGetSound(){
        assertEquals("badump", drum.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("badump", drum.play());
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals("large", drum.getSize());
    }
}
