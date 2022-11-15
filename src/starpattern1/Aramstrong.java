package starpattern1;

public class Aramstrong {
	public static void main(String [] args) {
		int num=153;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;// it is extract number 
			
			armnum=r*r*r+armnum;// i want to cube of number
			
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
