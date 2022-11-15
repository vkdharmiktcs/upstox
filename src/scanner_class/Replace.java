package scanner_class;

import java.util.Scanner;

public class Replace {
	public static void main(String [] args) {

Scanner s=new Scanner (System.in);
String name=s.next();
String correctname=name.replace("@","vinay");
System.out.println(correctname);
	}

}
