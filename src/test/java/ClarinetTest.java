import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("wood", "good", "black", "bleeet", 100.00, 250.00, 15.00);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", clarinet.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("good", clarinet.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", clarinet.getColour());
    }

    @Test
    public void canGetSound(){
        assertEquals("bleeet", clarinet.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("bleeet", clarinet.play());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(15.00, clarinet.getLength(), 0.01);
    }



}
