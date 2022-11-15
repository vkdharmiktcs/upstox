package scanner_class;

import java.util.Scanner;

public class A1 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hey user string with spl char");
		String name=s.next();
		String correctname=name.replace("vin@ay", "vivek");
		System.out.println(correctname);
	}

}
