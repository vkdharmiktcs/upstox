package logicalprogram;

public class Armstrong {
	public static void main(String [] args) {
		int num=371;
		int actnum=num;
		int r=0;
		int arm=0;
		while(num>0) {
			r=num%10;
			
			arm=r*r*r+arm;
			
			num=num/10;
			
		}
		if(arm==actnum) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
	}

}
