package collectin;

import java.util.ArrayList;

public class Class {
	public static void main(String [] args) {
		ArrayList s=new ArrayList ();
		s.add("vinay");
		s.add(100);
		s.add('G');
		s.add(100);
		s.add(null);
		s.add(null);
		
		//print all data 
		System.out.println(s);
		//get is size
		System.out.println(s.size());
		//check whether is empty
		System.out.println(s.isEmpty());
		//insertion operation
		s.add(4,200);
		System.out.println(s);
		//delete operation
		s.remove(4);
		System.out.println(s);
	}

}
