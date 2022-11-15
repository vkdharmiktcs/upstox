package collectin;

import java.util.LinkedHashSet;

import starpattern1.E;

public class LinkedhashSet2 {
	public static void main(String [] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add("payal");
		s.add(200);
		s.add('A');
		s.add(200);
		s.add(null);
		s.add(null);
		//to entire print data
		System.out.println(s);
		// to size
		System.out.println(s.size());
		// to empty
		System.out.println(s.isEmpty());
		
		
	}

}
