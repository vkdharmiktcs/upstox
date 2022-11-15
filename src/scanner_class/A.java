package scanner_class;

import java.util.Scanner;

public class A {
	public static void main(String [] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("hey user enter the  1st number");
	int num1=s.nextInt();
	
	System.out.println("2st number");
	int num2=s.nextInt();
	
	System.out.println(num1+num2);
	}

}
