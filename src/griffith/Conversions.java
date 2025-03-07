package griffith;

public class Conversions {

	// creating stub methods for the task one

	// creating method for euro to dollar convertion
	public double euroToDollar(double euro) {
		//adding example rate 1 to 1.1
		return euro * 1.1;

	}

	// creating method for dollar to euro convertion
	public double dollarToEuro(double dollar) {
		//adding example rate 1 to 0.91
		return dollar * 0.91;
	}

	// creating method that converts String to Integer
	public int stringToInteger(String val) {
		//implementing convertion with parse method
		return Integer.parseInt(val);
	}

	// creating method that converts Integer to String
	public String integerToString(int val) {
		//implementing convertion to string using valueOf method
		return String.valueOf(val);
	}

	// creating method that switches uppercase letters to lowercase latters and vice versa
	public String switchCase(String input) {
		//implementing switch case method using String Buildre
		StringBuilder result = new StringBuilder();
		
		//break down the string into the array of characters 
		for (char c : input.toCharArray()) {
			//if the character is uppercase, it will be converted to lowercase
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            //in other case the character is lowercase, consequently it will be converted to UpperCase
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
            //adding character to the future string
            else {
                result.append(c);
            }
        }
		
		return result.toString();
	}
}
