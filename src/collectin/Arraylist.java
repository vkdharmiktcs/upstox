package collectin;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String [] args) {
		
		ArrayList al=new ArrayList();
		al.add("vinay");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		
		//print all data in class 
		System.out.println(al);
		//get the size
		System.out.println(al.size());
		//check whether is empty
		System.out.println(al.isEmpty());
		//insertion operation
		al.add(3,500);
		System.out.println(al);
	al.remove(3);
		System.out.println(al);
	}

}
