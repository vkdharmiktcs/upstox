package logical_program1;

public class Armstrong_1 {
	public static void main(String [] args) {
		int num=371;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;
			armnum=r*r*r+armnum;
			num=num/10;
			
		}
		if(armnum==actnum) {
			System.out.println("num is armstrong ");
		}
		else {
			System.out.println("num is not armstrong");
		}
		
	}

}
