package logical_program1;

public class Primenumber1 {
	public static void main(String [] args) {
		int num=3;
		int count=0;
		for(int a=1;a<=num;a++) {
			if(num%a==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not prime");
		}
	}

}
