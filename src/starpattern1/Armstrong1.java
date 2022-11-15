package starpattern1;

public class Armstrong1 {
	public static void main(String [] args) {
		int num=183;
		int actnum=num;
		int a=0;
		int armnum=0;
		while(num>0) {
			a=num%10;//which is extract number
			
			armnum=a*a*a+armnum;//which is cube of number
			
			num=num/10;
			
			
		}
		if(armnum==actnum) {
			System.out.println("no is armstrong ");
		}
		else {
			System.out.println("no is not armstrong");
		}
	}

}
