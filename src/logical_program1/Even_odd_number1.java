package logical_program1;

import java.util.Scanner;

public interface Even_odd_number1 {
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter num");
		
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("given num is even");
			
			
		}
		else {
			System.out.println("given num is odd");
		}
	}

}
