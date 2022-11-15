package constructor_parameter;

public class Gun3 {
	String gunName;
	int noOfBullets;
	
	public Gun3 (String gunName, int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
		
	}
	public void shoot() {
		for (int i=1;i<=noOfBullets;i++) {
			System.out.println("hurry up");
			
		}
	}

}
