package ca1.task2;

//Create a class "CaesarCypher"

public class Loops {

	// Create method to print the word "words"
	
	public void printWords(int numberOfTimes) {
		
		// Create local variables "input" and "i" 
		
		String input = "words";
		
		int i;
		
		// Use for loop to repeatedly print "words" according to parameter "numberOfTimes"
		
		for (i=0; i<numberOfTimes; i++ ) {
			
			System.out.println(input);
			
		}
		
	}
	
	// Create main method to execute the program
	
		public static void main(String[] args) {
			
			int numberOfTimes = 5;
			
			Loops result = new Loops();
			
			result.printWords(numberOfTimes);
			
		}

}
