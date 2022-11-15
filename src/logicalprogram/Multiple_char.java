package logicalprogram;

import java.util.Scanner;

public class Multiple_char {
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
	System.out.println("string with mutltiple character");
	String name=s.next();
	String correctname=name.replaceAll("[^a-zA-Z]","");
	System.out.println(correctname);
	}

}
