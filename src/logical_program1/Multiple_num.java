package logical_program1;

import java.util.Scanner;

public class Multiple_num {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter with string multiple character");
	String name=s.next();
	String correctname=name.replaceAll("[^a-z,A-Z]","");
	System.out.println(correctname);
	}

}
