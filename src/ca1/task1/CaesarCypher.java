package ca1.task1;

public class CaesarCypher {
	
	// Create variables
	
	private char[] input = {};
	private char[] afterEncode = new char[input.length];
	private char[] afterDecode = new char[input.length];
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
		
		char[] result = {};
		
		// Use for loop to convert character of array to ascii code and add offset number before convert back to character
		
		for (i = 0; i < input.length; i++) {
			
			character = (input[i]);
			asciiCode = character;
			afterEncode[i] = (char)(asciiCode + offset);
				
		}
		
		// Output decoded array
		
		result = afterEncode;

		return afterEncode;
	}
	
	public char[] decode(char[] input, int offset) {
		return null;
	}
	
	
	public static void main(String[] arg) {
		
		char test = 'a';
		char test1;
		
		int number = test;
		test1 = (char) (number +1);
		
		System.out.println(number );
		System.out.println(test1);
		
		char[] input = {'a', 'b', 'c'};
		
		CaesarCypher cc = new CaesarCypher(input, 2);
		
		System.out.println(cc.encode());
		
		
		
		
		
	}
	
}
