package starpattern1;

import java.util.Scanner;

public class Repalce {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter string the which contains spl character");
		String name=s.next();
		String correctname=name.replace("vi@nay", "vivek");
				
		System.out.println(correctname);
	}
	


}
