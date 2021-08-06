package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object of the Car class
		Car audi = new Car();

		// Initialize the values
		audi.make = 2014;
		audi.color = "Black";
		audi.transmission = "Mannual";
		
		audi.displayCharacteristics();
		audi.accelerate();
		audi.brake();
	}

}
