import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "acoustic", "brown", "dling", 30.00, 120.00, 6);
    }
    
    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }
    
    @Test
    public void canGetType(){
        assertEquals("acoustic", guitar.getType());
    }
    
    @Test
    public void canGetColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void canGetSound(){
        assertEquals("dling", guitar.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("dling", guitar.play());
    }
    
    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
} 
