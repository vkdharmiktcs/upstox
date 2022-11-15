package logical_program1;

import java.util.Scanner;

public class B {
	public static void main(String [] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("get user number ");
		int num=i.nextInt();
		//Check the user of even or odd
		if(num%2==0) {
			System.out.println("get number is even");
		}
		else {
			System.out.println("get number is odd");
		}
		
	}

}
