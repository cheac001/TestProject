package ca1.task3;

//Create a class "ArrayCount"

public class ArrayCount {
	
//	String[] array = {};
//
//	String target = "";
	
	
	
	// Create method to count targeted string in an array

	public int count(String[] array, String target) {
		
		// Create local variables "count" and "i" 

		int match = 0;

		int i = 0;
		
		// Use for loop to match targeted string with all items in array and record any match with count

		for (i = 0; i < array.length; i++) {

			if (array[i] == target) {

				match = match + 1;

			}
			
		}
		
		// Use if statement to return the number when no match is found in array with target

		if (match==0) {

			System.out.println("Target " + target + " does not exist in the array");

			return match;
		}
		
		// Use else if statement to return the number when one match is found in array with target


		else if (match == 1) {

			System.out.println("Target " + target + " appears only once in the array");

			return match;

		}

		// Use else if statement to return the number when more than one match in array with target
		
		else {

			System.out.println("Target " + target + " appears multiple times in the array");

			return match;

		}

	}

	public static void main(String[] args) {
	
	String[] array = { "car1", "bus1", "car1", "bus2", "car1" };
	
	String target = "car1";
	
	ArrayCount ac = new ArrayCount();
	
	System.out.println(ac.count(array, target));
	
	}
}

