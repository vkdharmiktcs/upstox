package collectin;

import java.util.HashSet;

public class Hashset {
	public static void main(String [] args) {
		HashSet sh=new HashSet ();
		sh.add("vinay");
		sh.add(100);
		sh.add('S');
		sh.add(100);
		sh.add(null);
		sh.add(null);
		//to entire print data
		System.out.println(sh);
		//to get size
		System.out.println(sh.size());
		//empty
		System.out.println(sh.isEmpty());
		//clear method
		sh.clear();
		System.out.println(sh);
	
	}

}
