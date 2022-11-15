package scanner_class;

import java.util.Scanner;

public class B {
	public static void main(String [] args) {
		Scanner a=new Scanner(System.in);
	System.out.println("hey user enter the string");
	String name=a.next();
	String correctname=name.replaceAll("[^a-zA-Z]","");
	
	System.out.println(correctname);
	
	}

}
