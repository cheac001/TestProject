package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarProcessingTest {

	@Test
	void testRemoveDuplicates() {
		
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



}
