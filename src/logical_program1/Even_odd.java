package logical_program1;

import java.util.Scanner;

public class Even_odd {
	public static void main(String [] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("user enter number");
    int num=a.nextInt();
   // to check the of number is even or odd
    if(num%2==0) {
    	System.out.println("to check the number is  even ");
    }
    else {
    	System.out.println("check the number is odd");
    }
   
	}

}
