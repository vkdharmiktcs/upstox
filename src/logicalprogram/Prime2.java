package logicalprogram;

public class Prime2 {
	public static void main(String [] args) {
		int num=4;
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("no is not prime");
		}
	}

}
