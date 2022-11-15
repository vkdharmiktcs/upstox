package logical_program1;

import java.util.Scanner;

public class Even_odd_number {
	public static void main(String [] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("given enter the number");
	int num=scan.nextInt();
	if(num%2==0) {
		System.out.println("given no is even");
	}
	else {
		System.out.println("given no is odd");
	}
	}
}
