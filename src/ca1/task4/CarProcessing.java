package ca1.task4;

//Create a class "CarProcessing"

public class CarProcessing {
	
	// Method main is given in template to help student output result

	public static void main(String[] args) {

		CarProcessing cp = new CarProcessing();

		Car[] cars = { new Car("Honda", "Civic", "Red"), new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Blue"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Blue") };

		Car[] noDuplicates = cp.removeDuplicates(cars);

		for (Car c : noDuplicates) {
			System.out.println(c);
		}

	}
	
	// Create method removeDuplicates to remove duplicated items in an array

	public Car[] removeDuplicates(Car[] inputArray) {
		
		// Create local variables "i"  for loop index and "outputArray" to hold unique items in array

		int i;

		Car[] outputArray = new Car[inputArray.length];
		
		
		// Use for loop to perform matching with every items in array

		for (i = 0; i < inputArray.length - 1; i++) {
			
			
			// Create local variables "j" for another loop and "match" to hold number of match

			int j = 0;

			int match = 0;
			
			// Use another for loop to match one item to all other items in array

			for (j = i + 1; j < inputArray.length; j++) {
				
				
				// Use if statement to apply equals method and count number of matches

				if (inputArray[i].equals(inputArray[j]) == true) {

					match = match + 1;
				}
				
				else {
					;
				}

			}
			
			// Use if statement to all unique items into output array when match is equal to zero

			if (match == 0) {

				outputArray[i] = inputArray[i];
			}
			
			else {
				;
			}
		}
		
	
		// Create local variables "k" for another loop

		int k;
		
		
		// Use for loop to determine whether last item in input array is already included in output array

		for (k = 0; k < outputArray.length - 1; k++) {
			
			// Use if statement to all last item to output array if it is unique
			
			if (inputArray[inputArray.length - 1] != outputArray[k]) {

				outputArray[inputArray.length - 1] = inputArray[inputArray.length - 1];

			}
			
			else {
				;
			}
		}
		
		// return result as outputArray

		return outputArray;

	}
}
