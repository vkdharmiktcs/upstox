package logicalprogram;

import java.util.Scanner;

public class Even_odd {
	public static void main(String [] args) {
		Scanner s=new Scanner (System.in);
		
		System.out.println("hey user is num");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("num is even");
		}
		else {
			System.out.println("num is not num");
		}
	}

}
