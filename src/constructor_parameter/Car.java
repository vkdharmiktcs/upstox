package constructor_parameter;

public class Car {
	String carName;
	int noOfWheels;
	
	public Car(String carName, int noOfWheels) {
		this.carName=carName;
		this.noOfWheels=noOfWheels;
		
	}
	public void start() {
		for(int i=1;i<=noOfWheels;i++) {
			System.out.println("speed");
		}
	}

}
