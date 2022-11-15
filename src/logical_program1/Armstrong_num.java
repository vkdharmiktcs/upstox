package logical_program1;

public class Armstrong_num {
	public static void main(String [] args) {
		int num=153;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;//to used extract number
			armnum=r*r*r*+armnum;//i want to cube of num
			
			num=num/10;//
			
		}
		if(armnum==actnum) {
			System.out.println("num is armstrong");
		}
		else {
			System.out.println("num is not  armstrong");
		}
	}

}
