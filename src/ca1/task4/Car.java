package ca1.task4;

//Create a class "Car"

public class Car {

	// Create variables "make", "model" and "color"

	private String make;
	private String model;
	private String color;

	// Create constructors for variables;

	public Car(String make, String model, String color) {

		this.make = make;
		this.model = model;
		this.color = color;

	}

	// Create method toString to return a string representation of a car

	public String toString() {

		return this.make + " , " + this.model + " , " + this.color;

	}
	
	
	// Create method equals to compare model and color between objects
	
	public boolean equals (Car obj) {
		
		if (this.model == obj.model && this.color == obj.color) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	// Create method hashCode to return a integer to be used for comparison between objects
	
	public int hashCode() {
		
		int totalHashCode = model.hashCode() + color.hashCode();
		
		return totalHashCode;
		
	}
	
	public static void main(String[] args) {

		String make = "Honda";
		String model = "Civic";
		String color = "Red";

		Car c = new Car(make, model, color);

		System.out.println(c.toString());

		Car[] cars = { new Car("Honda", "Civic", "Red"), new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Purple") };

		int i;

		for (i = 0; i < cars.length; i++) {

			System.out.println(cars[i].toString());

		}
	}

}
