package ca1.task1;

import java.util.Arrays;

	// Create a class "CaesarCypher"

public class CaesarCypher {

	// Create variables

	private char[] input = {};

	private int offset = 0;

	char[] result = {};

	// Create constructor for variables

	public CaesarCypher(char[] input, int offset) {

		this.input = input;
		this.offset = offset;

	}

	// Create method to encode input array

	public char[] encode() {

		// Create local variables

		int i;
		int asciiCode;
		char character;
		char[] afterEncode = new char[input.length];

		//char[] result = {};

		// Use for loop to convert character of array to ascii code and add offset number before convert back to character

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

	public char[] decode() {

		// Create local variables

		int i;
		int asciiCode;
		char character;
		char[] afterDecode = new char[input.length];
		
		input = result;


		// Use for loop to convert character of decoded array to ascii code and subtract offset number before convert back to character
		

		for (i = 0; i < input.length; i++) {

			character = (input[i]);
			
			asciiCode = character;
			
			afterDecode[i] = (char) (asciiCode - offset);
			
		}
		
		// Output decoded array

		return afterDecode;
	}

	public static void main(String[] arg) {

		char[] input = { 'a', 'b', 'c' };

		CaesarCypher cc = new CaesarCypher(input, 2);

		System.out.println(Arrays.toString(cc.encode()));
		System.out.println(Arrays.toString(cc.decode()));

	}

}
