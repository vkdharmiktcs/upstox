package constructors_with_parameter;

public class Mobile {
	String mobileName;
	int noOfPrize;
	 
	public  Mobile(String mobileName, int noOfPrize) {
		this.mobileName=mobileName;
		this.noOfPrize=noOfPrize;
		
	}
	public void shoot() {
		for( int i=1;i<=noOfPrize;i++) {
			System.out.println("vinay");
			
		}
	}

}
