package constructors_with_parameter;

public class Guns4 {
	String gunName;
	int noOfBullets;
	public  Guns4 (String gunName, int noOfBullets){
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
		
	}
	public void shoot () {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("fier");
			
		}
	}

}
