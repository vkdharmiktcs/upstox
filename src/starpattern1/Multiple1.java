package starpattern1;

import java.util.Scanner;

public class Multiple1 {
	
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user string the contain spl symbol");
		
		String name=s.next();
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
		
		}

}
