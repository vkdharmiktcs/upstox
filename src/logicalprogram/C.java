package logicalprogram;

import java.util.Scanner;

public class C {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user print string with spl symbol");
		String name=s.next();
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
		
		
	}

}
