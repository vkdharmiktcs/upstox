package logical_program1;

import java.util.Scanner;

public class Replace_sepical_char {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string with special character");
		String nume=s.next();
		String correctname=nume.replace("vinay","java");
		System.out.println(correctname);
	}

}
