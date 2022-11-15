package logical_program1;

import java.util.Scanner;

public class Replace_String_chara {
	public static void main(String [] args) {
		Scanner g=new Scanner(System.in);
		System.out.println("get string contain spl character");
		String name=g.next();
		String correctname=name.replace("vinay", "vivek");
		System.out.println(correctname);
	}

}
