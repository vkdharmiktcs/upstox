package constructor_parameter;

public class Guns2 {
	String gunName;
	int noOfBullets;
	
	public Guns2(String gunName, int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
		
	}
	public void Shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			
			System.out.println("attack");
		}
	}

}
