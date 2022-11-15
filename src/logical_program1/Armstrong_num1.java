package logical_program1;

public class Armstrong_num1 {
	public static void main(String [] args) {
		int num=153;
		int actnum=num;
		int s=0;
		int armnum=0;
		while(num>0) {
			s=num%10;//to used extract number
			
			armnum=s*s*s*+armnum;// want to cube number
			num=num/10;
		}
		if(armnum==actnum) {
			System.out.println("num of armstrong");
		}
		else {
			System.out.println("num of not armstrong");
		}
	}

}
