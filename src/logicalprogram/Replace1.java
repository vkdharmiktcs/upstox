package logicalprogram;

import java.util.Scanner;

public class Replace1 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("hey user string with spl character");
	String name=s.next();
	String correctname=name.replaceAll("[^a-zA-Z]","");
	System.out.println(correctname);
	}

}
