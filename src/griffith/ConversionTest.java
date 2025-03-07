package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversionTest {

    @Test
    
    //testing euro to dollar conversion
    public void testEuroToDollar() {
        Conversions conv = new Conversions();
        
        //examples for conversion rates
        assertEquals(1.1, conv.euroToDollar(1.0), 0.01);  
        assertEquals(11.0, conv.euroToDollar(10.0), 0.01);
        assertEquals(0.0, conv.euroToDollar(0.0), 0.01);
    }

}
