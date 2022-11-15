package logical_program1;

import java.util.Scanner;

public class A4 {
	public static void main(String [] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("user enter the number");
		int num=r.nextInt();
		if(num%4==0) {
			System.out.println("to enter the number is even");
		}

	else {
		System.out.println("to enter ther number is odd");
	}
	}
}
