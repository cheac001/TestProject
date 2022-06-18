package ca1.task4;

//Create a class "Car"

public class Car {

	// Create three variables "make", "model" and "color"

	private String make = "";
	private String model = "";
	private String color = "";

	// Create constructors for three variables;

	public Car(String make, String model, String color) {

		this.make = make;
		this.model = model;
		this.color = color;

	}

	
	// Create a method to return a string representation of a car

	public String toString() {

		return make + " , " + model + " , " + color;

	}

	
	// Create method equals to compare model and color between objects

	public boolean equals(Car obj) {

		// Use equals method in if & else statement to check whether both model and
		// color are the same between objects and return result true or false
		
		// If the same then return true

		if (model == obj.model && color == obj.color) {

			return true;
		}
		
		// If different then return false

		else {

			return false;
		}
	}

	
	// Create method hashCode to return a integer to be used for comparison between objects

	public int hashCode() {

		int totalHashCode = model.hashCode() + color.hashCode();

		return totalHashCode;
	}

//  Create main method to execute the program

	public static void main(String[] args) {

		String make = "Honda";
		String model = "Civic";
		String color = "Red";

		Car car0 = new Car(make, model, color);

		System.out.println(car0.toString());
	}
}
