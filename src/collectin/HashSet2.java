package collectin;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String [] args) {
		HashSet hs=new HashSet();
		hs.add("vinay");
		hs.add(100);
		hs.add('S');
		hs.add(100);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		//to size
		System.out.println(hs.size());
		//to empty
		System.out.println(hs.isEmpty());
		//clear method
		hs.clear();
		System.out.println(hs);
	}

}
