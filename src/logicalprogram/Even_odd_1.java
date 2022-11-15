package logicalprogram;

import java.util.Scanner;

public class Even_odd_1 {
	public static void main(String [] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("given no is even and odd");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("num is even");
		}
		else {
			System.out.println("num is odd");
		}
	}

}
