package ca1.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@Test
	void testEncode() {
		
		char[] input = {'a', 'b', 'c'};
		char[] expected = {'c', 'd', 'e'};
		
		CaesarCypher cc = new CaesarCypher(input, 2);
		
		assertArrayEquals(expected, cc.encode(), "The encoding method does not work as expected.");
	
	}

	@Test
	void testDecode() {
		
		char[] input = {'c', 'd', 'e'};
		char[] expected = {'a', 'b', 'c'};
		
		CaesarCypher cc = new CaesarCypher(input, 2);
		
		assertArrayEquals(expected, cc.decode(), "The encoding method does not work as expected.");


	}

}
