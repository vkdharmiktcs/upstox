package collectin;

import java.util.LinkedHashSet;

public class LinkedHashSet4 {
	public static void main(String [] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("vinay");
		lhs.add(100);
		lhs.add('A');
		lhs.add(null);
		lhs.add(null);
		lhs.add(100);
		// to print entire data
		System.out.println(lhs);
		//to get size
		System.out.println(lhs.size());
		//to empty
		System.out.println(lhs.isEmpty());
		
	}

}
