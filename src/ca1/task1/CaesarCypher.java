package ca1.task1;

// Create a class "CaesarCypher"

public class CaesarCypher {

	// Create method to encode input array

	public char[] encode(char[] input, int offset) {

		// Create variable "i" for index in loop,
		// Crate variables "asciiCode" & "character" for translation between int & char
		// Create variable "afterEncode" to hold the encoded output with same length of
		// input array

		int i;
		int asciiCode;
		char character;
		char[] afterEncode = new char[input.length];

		// Use try to handle error in program

		try {

			// Use for loop to convert character of array to ascii code and add offset
			// number
			// before convert back to character

			for (i = 0; i < input.length; i++) {

				character = (input[i]);
				asciiCode = character;
				afterEncode[i] = (char) (asciiCode + offset);

			}

		}

		// Use catch to provide error message

		catch (Exception e) {

			System.out.println("There is a problem required solution!");

		}

		// Output encoded array

		return afterEncode;
	}

	// Create method to decode encoded array

	public char[] decode(char[] input, int offset) {

		// Create variable "i" for index in loop,
		// Crate variables "asciiCode" & "character" for translation between int & char
		// Create variable "afterDecode" to hold the decoded output with same length of
		// input array

		int i;
		int asciiCode;
		char character;
		char[] afterDecode = new char[input.length];

		// Use try to handle error in program

		try {

			// Use for loop to convert character of decoded array to ascii code and subtract
			// offset number before convert back to character

			for (i = 0; i < input.length; i++) {

				character = (input[i]);

				asciiCode = character;

				afterDecode[i] = (char) (asciiCode - offset);

			}

		}

		// Use catch to provide error message

		catch (Exception e) {

			System.out.println("There is a problem required solution!");

		}

		// Output decoded array

		return afterDecode;
	}

	//  Create main method to execute the program

	public static void main(String[] arg) {

		CaesarCypher cc = new CaesarCypher();

		char[] input1 = { 'a', 'b', 'c' };
		char[] input2 = { 'c', 'd', 'e' };

		System.out.println(cc.encode(input1, 2));
		System.out.println(cc.decode(input2, 2));

	}

}
