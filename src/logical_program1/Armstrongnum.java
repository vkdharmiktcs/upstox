package logical_program1;

public class Armstrongnum {
	public static void main(String [] args) {
		int num=140;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;//to no of extract no
			
			armnum=r*r*r*+armnum;
			num=num/10;
			
		}
		if(armnum==actnum) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
	}

}
