package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversionTest {

	@Test

	// testing euro to dollar conversion
	public void testEuroToDollar() {
		Conversions conv = new Conversions();

		// examples for conversion rates
		assertEquals(1.1, conv.euroToDollar(1.0), 0.01);
		assertEquals(11.0, conv.euroToDollar(10.0), 0.01);
		assertEquals(0.0, conv.euroToDollar(0.0), 0.01);
	}

	// testing dollar to euro conversion
	@Test
	public void testDollarToEuro() {
		Conversions conv = new Conversions();

		// examples for conversion rates
		assertEquals(0.91, conv.dollarToEuro(1.0), 0.01);
		assertEquals(9.1, conv.dollarToEuro(10.0), 0.01);
		assertEquals(0.0, conv.dollarToEuro(0.0), 0.01);
	}
	
	
	// testing String to integer method
	@Test
	public void testStringToInteger() {
		Conversions conv = new Conversions();
		//adding required examples to test different values
		assertEquals(123, conv.stringToInteger("123"));
		assertEquals(-45, conv.stringToInteger("-45"));
		assertThrows(NumberFormatException.class, () -> conv.stringToInteger("abc"));
	}
	
	//testing integer to String method
	@Test
    public void testIntegerToString() {
        Conversions conv = new Conversions();
        
        //adding reqired examples to test different values
        assertEquals("123", conv.integerToString(123));
        assertEquals("-45", conv.integerToString(-45));
        assertEquals("0", conv.integerToString(0));
    }
	
	//testing method that switching upper and lower cases and vice versa
	@Test
    public void testSwitchCase() {
        Conversions conv = new Conversions();
        
        //adding the values and testing the convertion method for different phrazes
        assertEquals("hELLO wORLD", conv.switchCase("Hello World"));
        assertEquals("123!@#", conv.switchCase("123!@#"));
        assertEquals("tHiS iS a tEsT", conv.switchCase("ThIs Is A TeSt"));
    }
}
