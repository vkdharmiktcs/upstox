package logical_program1;

import java.util.Scanner;

public class Demo4 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string is the name which contain spl character");
		String name=s.next();
		String correctname=name.replace("@", "vinay");
		System.out.println(correctname);
	}

}
