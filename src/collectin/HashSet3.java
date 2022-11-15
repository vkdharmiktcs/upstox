package collectin;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String [] args) {
		HashSet hs=new HashSet();
		hs.add("vinay");
		hs.add(200);
		hs.add('B');
		hs.add(200);
		hs.add(null);
		hs.add(null);
		// to get entire data
		System.out.println(hs);
		// to get size
		System.out.println(hs.size());
		//to empty
		System.out.println(hs.isEmpty());
		//clear method
		hs.clear();
		System.out.println(hs);
	}

}
