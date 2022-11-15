package logical_program1;

import java.util.Scanner;

public class Multiple2 {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("hey user the string with speical symbol");
		String name=scan.next();
		String correctname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(correctname);
		
	}

}
