package starpattern1;

public class Armstrong_Num {
	public static void main(String [] args) {
		int num=153;
		int actnum=num;
		int s=0;
		int armnum=0;
		
		while(num>0) {
			s=num%10;//to extract the number
			
			armnum=s*s*s+armnum;///to cube to the number
			
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
