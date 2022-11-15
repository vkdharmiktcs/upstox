package starpattern1;

import java.util.Scanner;

public class Even_odd {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user enter the number");
int num=s.nextInt();

		 if(num%4==0) {
			 System.out.println("user enter the even");
		 }
		 else {
			 System.out.println("user enter the odd");
		 }
	}
	
}
