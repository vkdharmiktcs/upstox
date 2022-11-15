package logical_program1;

import java.util.Scanner;

public class Special_charcter {
	public static void main(String [] args) {
		Scanner g=new Scanner (System.in);
		System.out.println("enter string which contain spl character");
		String name=g.next();
		String correctname=name.replace("@", "vinay");
		System.out.println(correctname);
				
	}

}
