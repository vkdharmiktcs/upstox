package starpattern1;

import java.util.Scanner;

public class Replace1 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("hey user the string which contain the spl chachter");
		String name=s.next();
		String correctname=name.replace("@", "5");
				
	
	System.out.println(correctname);
	}
}



