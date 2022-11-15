package scanner_class;


import java.util.Scanner;
public class Demo {
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("hey user print it 1st num");
		int num1=s.nextInt();
		
		System.out.println("hey user print it 2nd num");
		int num2=s.nextInt();
		
		System.out.println(num1+num2);
	}

}
