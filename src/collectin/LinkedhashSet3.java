package collectin;

import java.util.LinkedHashSet;

public class LinkedhashSet3 {
	public static void main(String [] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("vinay");
		lhs.add(200);
		lhs.add('S');
		lhs.add(200);
		lhs.add(null);
		lhs.add(null);
		
		//to get entire print data
		System.out.println(lhs);
		// to get size 
		System.out.println(lhs.size());
		//to empty 
		System.out.println(lhs.isEmpty());
	}

}
