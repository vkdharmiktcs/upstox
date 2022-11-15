package logical_program1;

import java.util.Scanner;

public class B1 {
	public static void main(String [] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("get user for number ");
		int num=a.nextInt();
		//get the user for number is even or odd
		if(num%4==0) {
			System.out.println("get user for even ");
		}
		else {
			System.out.println("get user for odd ");
		}
	}

}
