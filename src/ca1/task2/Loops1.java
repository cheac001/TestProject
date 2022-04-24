package ca1.task2;

//Create a class "Loops"

public class Loops1 {

	// Create method to print the word "words"

	public void printWords(int numberOfTimes) {

		// Create local variables "input" and "i"

		String input = "words";
		
		int i;

		// Use for loop to repeatedly print "words" according to parameter
		// "numberOfTimes"

		for (i = 0; i < numberOfTimes; i++) {

			System.out.println(input);

		}

	}

	
	public void indexMore() {
		
		int k;
		
		for (k=0; k<4; k++) {
		
			int i;
			
			for (i=(k); i<3; i++) {
	
				System.out.println("k = " + k +  ", i= " + i + " try0");
	
			}
		}
//			for (i=(number+1); i<3; i++) {
//	
//				System.out.println("index = " + i + " try1");
//	
//			}
//			
//			
//			for (i=(number+2); i<3; i++) {
//	
//				System.out.println("index = " + i + " try2");
//	
//			}
//			
//			for (i=(number+3); i<3; i++) {
//	
//				System.out.println("index = " + i + " try3");
//	
//			}
		
		
	}
	
	
	// Create main method to execute the program

	public static void main(String[] args) {

		// Assign a integer value to numberOfTimes

		int numberOfTimes = 5;

		// Create object "result" using Loops class

		Loops1 result = new Loops1();

		// Call method "printWords" using object

		result.printWords(numberOfTimes);

		int i;
		
		for (i=0; i<3; i++) {

			System.out.println("index = " + i + " try0");

		}
		
		for (i=1; i<3; i++) {

			System.out.println("index = " + i + " try1");

		}
		
		
		for (i=2; i<3; i++) {

			System.out.println("index = " + i + " try2");

		}
		
		for (i=3; i<3; i++) {

			System.out.println("index = " + i + " try3");
			System.out.println("\n");

		}
		
		
		result.indexMore();
		
		
	}

}
