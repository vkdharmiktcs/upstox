package collectin;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String [] args) {
		HashSet h=new HashSet();
		h.add("vivek");
		h.add(200);
		h.add('S');
		h.add(200);
		h.add(null);
		h.add(null);
		
		//to print entire data
		System.out.println(h);
		//to get size
		System.out.println(h.size());
		//to empty
		System.out.println(h.isEmpty());
          //to clear
		h.clear();
		System.out.println(h);
	}

}
