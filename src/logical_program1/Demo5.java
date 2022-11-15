package logical_program1;

import java.util.Scanner;

public class Demo5 {
	public static void main(String [] args) {
		Scanner a=new Scanner(System.in);
		
		
		/* System.out.println("hey user enter number 1st");
		
		int num1=a.nextInt();
		
		System.out.println("her user enter number 2nd");
		int num2=a.nextInt();
		
		//add to this number
		System.out.println(num1+num2);*/
		
		System.out.println("hey user enter name s");
		String name1=a.next();
		String correctname=name1.replaceAll("","vinay");
		
		System.out.println(correctname);
	
	}

}
