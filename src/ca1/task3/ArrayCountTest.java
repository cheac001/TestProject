package ca1.task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayCountTest {
	
	// Perform first test with target does not exist in the array

	@Test
	void testCount1() {

		ArrayCount ac = new ArrayCount();

		String[] array = { "car1", "bus1", "car1", "bus2", "car1" };

		String target = "bus3";

		int expected = 0;

		assertArrayEquals(expected, ac.count(array, target), "The encoding method does not work as expected.");

	}
	
	// Perform second test with target appears only once in the array

	@Test
	void testCount2() {

		ArrayCount ac = new ArrayCount();

		String[] array = { "car1", "bus1", "car1", "bus2", "car1" };

		String target = "bus1";

		int expected = 1;

		assertArrayEquals(expected, ac.count(array, target), "The encoding method does not work as expected.");

	}

	// Perform third test with target appears multiple times in the array
	
	@Test
	void testCount3() {

		ArrayCount ac = new ArrayCount();

		String[] array = { "car1", "bus1", "car1", "bus2", "car1" };

		String target = "car1";

		int expected = 3;

		assertArrayEquals(expected, ac.count(array, target), "The encoding method does not work as expected.");

	}

	private void assertArrayEquals(int expected, int count, String string) {
		// TODO Auto-generated method stub

	}

}
