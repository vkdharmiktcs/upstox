package scanner_class;

import java.util.Scanner;

public class Even_odd_1 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
      System.out.println("enter the nunmber");
      int num=s.nextInt();
      
      if(num%2==0) {
    	  System.out.println("no is even");
      }
      else {
    	  System.out.println("no is odd");
      }
	}

}
