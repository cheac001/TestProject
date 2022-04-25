package ca1.task4;

public class CarProcessing1 {
	
	
	Car[] result = {};
	

	public static void main(String[] args) {
		
		Car car1 = new Car("Honda", "Civic", "Red");
		
		System.out.println(car1.hashCode());
		

		CarProcessing1 cp = new CarProcessing1();

		Car[] cars = { new Car("Honda", "Civic", "Red"), new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Blue"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Blue") };

		Car[] noDuplicates = cp.removeDuplicates(cars);

		for (Car c : noDuplicates) {
			System.out.println(c);
		}
		
	}

	
	public Car[] removeDuplicates(Car[] inputArray) {
		

		int i;

		Car[] outputArray = new Car[inputArray.length];
		

		for (i = 0; i < inputArray.length - 1; i++) {

			int j=0;
			
			int match = 0;
			
			

			for (j = i+1; j < inputArray.length; j++) {
				
				System.out.println(i);
				System.out.println(j);
				

				if (inputArray[i].equals(inputArray[j]) == true && (inputArray[i].hashCode() != inputArray[j].hashCode()))  {
					
					match = match + 1;
					
					System.out.println("Item " + inputArray[i] + " has match with " + inputArray[j]);

				}
				
				else {
					
					System.out.println("Item " + inputArray[i] + " has not match with " + inputArray[j]);
				}

			}
			
			if (match == 0) {

				outputArray[i] = inputArray[i];
				
				System.out.println("Item " + inputArray[i] + " is unique so added to output array.");
				
			}
			
			else {
				
				System.out.println("Item " + inputArray[i] + " is not unique so do not add to output array.");
			}
			
		}
		


		int k;

		for (k = 0; k < outputArray.length-1; k++) {
			

			if (inputArray[inputArray.length -1] != outputArray[k] && (inputArray[inputArray.length -1].hashCode() != outputArray[k].hashCode())) {
				

				outputArray[inputArray.length -1] = inputArray[inputArray.length-1];
				
				
				System.out.println("Item " + inputArray[inputArray.length -1] + " has not match with " + outputArray[k] + " is unique add to output array.");

			}
			
			
			else {
				
				System.out.println("Item " + inputArray[inputArray.length -1] + " has matched with " + outputArray[k] + " so not unique");

			}
			
		}
		
		result = outputArray;
		
		return outputArray;
		
		////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
//		int i;
//
//		Car[] outputArray = new Car[inputArray.length];
//		
//
//		for (i = 0; i < inputArray.length - 1; i++) {
//
//			int j;
//
//			for (j = 1; j < inputArray.length; j++) {
//
//				if (inputArray[i].hashCode() != inputArray[j].hashCode()) {
//
//					outputArray[i] = inputArray[i];
//
//				}
//			}
//		}
//
//		int k;
//
//		for (k = 0; k < outputArray.length-1; k++) {
//
//			if (inputArray[inputArray.length - 1] != outputArray[k]) {
//
//				outputArray[inputArray.length -1] = inputArray[inputArray.length-1];
//
//			}
//		}
//		

		////////////////////////////////////////
		

	}
}
