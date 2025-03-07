//Artem Dogadailo 3133807

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversionTest {

	@Test
	// creating test for euro to dollar conversion
	public void testEuroToDollar() {
		Conversions conv = new Conversions();
		// adding example values for the conversion
		assertEquals(1.1, conv.euroToDollar(1.0), 0.01);
		assertEquals(11.0, conv.euroToDollar(10.0), 0.01);
		assertEquals(0.0, conv.euroToDollar(0.0), 0.01);
	}

	@Test
	// implementing unit test for the dollar to euro conversion
	public void testDollarToEuro() {
		Conversions conv = new Conversions();
		// adding example values for the conversion
		assertEquals(0.91, conv.dollarToEuro(1.0), 0.01);
		assertEquals(9.1, conv.dollarToEuro(10.0), 0.01);
		assertEquals(0.0, conv.dollarToEuro(0.0), 0.01);
	}

	@Test
	// implementing String to integer conversion unit test method
	public void testStringToInteger() {
		Conversions conv = new Conversions();
		// adding example values for more accure testing
		assertEquals(123, conv.stringToInteger("123"));
		assertEquals(-45, conv.stringToInteger("-45"));
		assertThrows(NumberFormatException.class, () -> conv.stringToInteger("abc"));
	}

	@Test
	// implementing integer to String conversion unit test
	public void testIntegerToString() {
		Conversions conv = new Conversions();
		//adding examle values to the test
		assertEquals("123", conv.integerToString(123));
		assertEquals("-45", conv.integerToString(-45));
		assertEquals("0", conv.integerToString(0));
	}

	@Test
	//implementing unit test method for the switch case method
	public void testSwitchCase() {
		Conversions conv = new Conversions();
		//adding example values for the swith case conversion
		assertEquals("hELLO wORLD", conv.switchCase("Hello World"));
		assertEquals("123!@#", conv.switchCase("123!@#"));
		assertEquals("tHiS iS a tEsT", conv.switchCase("ThIs Is A TeSt"));
	}
}
