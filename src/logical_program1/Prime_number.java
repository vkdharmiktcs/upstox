package logical_program1;

public class Prime_number {
	public static void main(String [] args) {
		int num=5;
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			}
	if(count==2) {
			System.out.println("number is prime");
		}
		
	else {
			System.out.println("number is not prime ");
		}
	}

}
