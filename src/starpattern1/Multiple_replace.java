package starpattern1;

import java.util.Scanner;

public class Multiple_replace {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user string which contain spl symbol");
		
		String name=s.next();
		String correctname=name.replaceAll("[^a-z,A-Z]","");
		System.out.println(correctname);
	}
}

		