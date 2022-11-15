package scanner_class;

import java.util.Scanner;

public class Even_odd_2 {
	public static void main(String [] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("hey user print no");
		int num=a.nextInt();
		
		if(num%2==0) {
			System.out.println("no is even ");
		}
		else {
			System.out.println("no is odd");
		}
	}

}
