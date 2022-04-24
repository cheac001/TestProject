package ca1.task4;

//Create a class "Car"

public class Car {

	// Create variables "make", "model" and "color"

	private String make = "";
	private String model = "";
	private String color = "";

	// Create constructors for variables;

	public Car(String make, String model, String color) {

		this.make = make;
		this.model = model;
		this.color = color;

	}
	


	// Create method toString to return a string representation of a car

	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public String getColor() {
		return color;
	}


	public String toString() {

		return make + " , " + model + " , " + color;

	}

	// Create method equals to compare model and color between objects

	public boolean equals(Car obj) {

		// use if & else statement to check whether both model and color are the same
		// between objects and return result true or false

		if (model == obj.model && color == obj.color) {

			return true;
		}

		else {

			return false;
		}
	}

	// Create method hashCode to return a integer to be used for comparison between
	// objects

	public int hashCode() {

		int totalHashCode = model.hashCode() + color.hashCode();

		return totalHashCode;

	}

	public static void main(String[] args) {

		String make = "Honda";
		String model = "Civic";
		String color = "Red";

		Car car0 = new Car(make, model, color);

		System.out.println(car0.toString());

		Car[] cars = { new Car("Honda", "Civic", "Red"), new Car("Honda", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"), new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"), new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"), new Car("Honda", "Civic", "Purple") };

		int i;

		for (i = 0; i < cars.length; i++) {

			System.out.println(cars[i].toString());

		}
		
		Car car1 = new Car("Honda", "Civic", "Red");
		Car car2 = new Car("Jeep", "Wrangler", "Blue");
		
		System.out.println(car0.equals(car1));
		System.out.println(car0.equals(car2));
		
		System.out.println(car0.hashCode());
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
	}

}
