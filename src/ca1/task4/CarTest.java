package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	
	// Perform first test with input Jeep, Wrangler and Blue

	@Test
	void testToString1() {
		
		Car c = new Car("Jeep", "Wrangler", "Blue");
		
		String expected = "Jeep , Wrangler , Blue";
		
		assertArrayEquals(expected, c.toString(), "The toString method does not work as expected");

	}

	private void assertArrayEquals(String expected, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	// Perform second test with input Toyota , Camry and Green
	
	@Test
	void testToString2() {
		
		Car c = new Car("Toyota", "Camry", "Green");
		
		String expected = "Toyota , Camry , Green";
		
		assertArrayEquals(expected, c.toString(), "The toString method does not work as expected");

	}
	
}
