package logicalprogram;

public class Armstrong_num {
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
			System.out.println("no is armnum");
		}
		else {
			System.out.println("no is not armnum");
		}
	}

}
