package logical_program1;

public class Prime_num1 {
	public static void main(String [] args) {
		int num=5;
		int count =0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}	
		}
			if(count==2) {
				System.out.println(" no is prime");
			}
			else {
				System.out.println("no is not prime");
			}
			
				
			
	}

}
