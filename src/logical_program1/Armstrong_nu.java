package logical_program1;

public class Armstrong_nu {
	public static void main(String [] args) {
		int num=371;
		int actnum=num;
		int r=0;
		int armnum=0;
		
		while(num>0) {
			r=num%10;//to extract number
			
			armnum=r*r*r+armnum;//to cube number
			
			num=num/10;
			
		}
		if(armnum==actnum) {
			System.out.println("armstrong is number");
		}
		else {
			System.out.println("armstrong is not number");
		}
	}

}
