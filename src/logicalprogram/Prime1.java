package logicalprogram;

public class Prime1 {
	public static void main(String [] args) {
	int num=4;
	int actnum=num;
	int s=0;
	int armnum=0;
	while(num>0) {
		s=num%10;
		armnum=s*s*s+armnum;
		num=num/10;
		
	}
	if(armnum==actnum) {
		System.out.println("given num is armstrong");
	}
	else {
		System.out.println("given num is not armstrong");
	}
	}

}
