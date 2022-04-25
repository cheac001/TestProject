package ca1.task1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Create a class "CaesarCypher"

public class CaesarCypher {

	// Create variable to hold result

	char[] result = {};

	// Create method to encode input array

	public char[] encode(char[] input, int offset) {

		// Create local variables "i", "asciiCode", "character", "afterEncode"

		int i;
		int asciiCode;
		char character;
		char[] afterEncode = new char[input.length];

		// Use for loop to convert character of array to ascii code and add offset
		// number before convert back to character

		for (i = 0; i < input.length; i++) {

			character = (input[i]);
			asciiCode = character;
			afterEncode[i] = (char) (asciiCode + offset);

		}

		// Output encoded array

		result = afterEncode;

		return afterEncode;
	}

	// Create method to decode encoded array

	public char[] decode(char[] input, int offset) {

		// Create local variables "i", "asciiCode", "character", "afterDecode"

		int i;
		int asciiCode;
		char character;
		char[] afterDecode = new char[input.length];

		input = result;

		// Use for loop to convert character of decoded array to ascii code and subtract
		// offset number before convert back to character

		for (i = 0; i < input.length; i++) {

			character = (input[i]);

			asciiCode = character;

			afterDecode[i] = (char) (asciiCode - offset);

		}

		// Output decoded array

		return afterDecode;
	}

	public static void main(String[] arg) {
		
		CaesarCypher cc = new CaesarCypher();

		char[] input1 = {'a', 'b', 'c'};
		char[] input2 = {'c', 'd', 'e'};

		System.out.println(cc.encode(input1, 2));
		System.out.println(cc.decode(input2, 2));
		
	}
	
	
	
}
