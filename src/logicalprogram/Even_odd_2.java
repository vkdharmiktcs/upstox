package logicalprogram;

import java.util.Scanner;

public class Even_odd_2 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("user enter the number");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println(" number is odd");
		}
	}

}
