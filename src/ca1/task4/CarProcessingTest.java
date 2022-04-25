package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarProcessingTest {
	
	// Perform first test with one duplication on "Civic" and "Red" to see whether one will be removed in output array

	@Test
	void testRemoveDuplicates1() {
		
		CarProcessing cp = new CarProcessing();

		Car[] input = { new Car("Honda", "Civic", "Red"), new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Purple") };
		
		Car[] expected = {null, new Car("Holden", "Civic", "Red"), new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Purple") };
		
		assertArrayEquals(expected, cp.removeDuplicates(input), "The removeDuplicates method does not work as expected" );

	}

	private void assertArrayEquals(Car[] expected, Car[] removeDuplicates, String string) {
		// TODO Auto-generated method stub
		
	}
	
	// Perform second test with three duplication on Civic Red, Wrangler Blue and Civic Blue to see whether three will be removed in output array

	@Test
	void testRemoveDuplicates2() {
		
		CarProcessing cp = new CarProcessing();

		Car[] input = { new Car("Honda", "Civic", "Red"), new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Blue"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Blue") };
		
		Car[] expected = {null, new Car("Holden", "Civic", "Red"), null, new Car("Jeep", "Wrangler", "Blue"),
				new Car("Holden", "Falcon", "Yellow"), null,
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Blue") };
		
		assertArrayEquals(expected, cp.removeDuplicates(input), "The removeDuplicates method does not work as expected" );

	}
	
	
	
	
	
	
	
	

}
