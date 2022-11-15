package logical_program1;

import java.util.Scanner;

public class Multiple {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("string name with multiple character");
		String name=scan.next();
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
	}

}
