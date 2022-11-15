package scanner_class;

import java.util.Scanner;

public class Replace_char {
	public static void main(String [] args) {
		Scanner s=new Scanner (System.in);
	System.out.println("hey user string with multiple character");
	String name=s.next();
	String correctname=name.replaceAll("[^a-zA-Z]", "");
	System.out.println(correctname);
	}

}
