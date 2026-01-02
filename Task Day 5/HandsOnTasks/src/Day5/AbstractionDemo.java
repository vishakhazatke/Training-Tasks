package Day5;

abstract class VehicleDemo{
	
	abstract void applyBreaks();
	
	abstract void accelerate();
	
	void VehicleDetails() {
		
		System.out.println("The vehicle name is Car");
	}
}

class CarDemo extends VehicleDemo{

	@Override
	void applyBreaks() {

		System.out.println("The vehicle car should apply breaks when needed");
	}

	@Override
	void accelerate() {

		System.out.println("The vehicle car should accelerate when needed");
	}	
}

public class AbstractionDemo {

	public static void main(String[] args) {

		CarDemo c1 = new CarDemo();
		c1.applyBreaks();
		c1.accelerate();
		c1.VehicleDetails();
	}

}
