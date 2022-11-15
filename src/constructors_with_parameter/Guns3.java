package constructors_with_parameter;

public class Guns3 {//BLC
	String gunName;
	int noOfBullets;
	public Guns3 (String  gunName, int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
		
	}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("bomb");
			
		}
	}
	

}
