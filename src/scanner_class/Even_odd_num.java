package scanner_class;

import java.util.Scanner;

public class Even_odd_num {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user enter no");
		int num=s.nextInt();
		
		if(num%4==0) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
	}

}
