package activities;

public class Car {

	// Variable declaration
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

// Constructor
	Car() {
		tyres = 4;
		doors = 4;
	}

// Methods
	/*
	 * displayCharacteristics() - This displays the values of all the variables
	 * accelarate() - This prints "Car is moving forward." brake() - This prints
	 * "Car has stopped."
	 */

	public void displayCharacteristics() {

		System.out.println("The color of the car is: " + color);
		System.out.println("The transmission of the car is: " + transmission);
		System.out.println("The make of the car is: " + make);
		System.out.println("The number of tyres in the car : " + tyres);
		System.out.println("The number of doors in the car: " + doors);

	}

	public void accelerate() {
		System.out.println("Car is moving forward.");

	}

	public void brake() {
		System.out.println("Car has stopped.");

	}

}