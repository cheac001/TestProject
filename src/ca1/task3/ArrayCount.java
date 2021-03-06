package ca1.task3;

//Create a class "ArrayCount"

public class ArrayCount {

	// Create a method to count targeted string in an array

	public int count(String[] array, String target) {

		// Create local variables "match" to hold the number of matches and "i" for index in loop

		int match = 0;
		int i = 0;

		// Use for loop to match targeted string with all items in array and record any
		// match with match by adding one

		for (i = 0; i < array.length; i++) {

			if (array[i] == target) {

				match = match + 1;
			}
		}

		// Use if statement to return the number when no match is found in array with target

		if (match == 0) {

			System.out.println("Target " + target + " does not exist in the array");

			return match;
		}

		// Use else if statement to return the number when one match is found in array
		// with target

		else if (match == 1) {

			System.out.println("Target " + target + " appears only once in the array");

			return match;

		}

		// Use else statement to return the number when more than one match in array
		// with target

		else {

			System.out.println("Target " + target + " appears multiple times in the array");

			return match;

		}

	}

}
