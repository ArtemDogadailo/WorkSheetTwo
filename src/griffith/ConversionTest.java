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
}
