package ca1.task3;

public class ArrayCount {

	public int count(String[] array, String target) {

		int count = 0;

		int i = 0;

		for (i = 0; i < array.length; i++) {

			if (array[i] == target) {

				count = count + 1;

			}

			else {

				System.out.println("Target " + target + " does not exist in the array");

				return count;
			}

		}

		if (count == 1) {

			System.out.println("Target " + target + " appears once in the array");

			return count;

		}

		else {

			System.out.println("Target " + target + " appears multiple times in the array");

			return count;

		}

	}

	String[] array = { "car1", "bus1", "car1", "bus2", "car1" };

}
