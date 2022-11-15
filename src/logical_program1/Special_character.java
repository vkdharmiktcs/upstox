package logical_program1;

import java.util.Scanner;

public class Special_character {
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("string name is enter with speical character");
	String name=s.next();
	String correctname=name.replace("vinay","@" );
	System.out.println(correctname);
	}

}
