package collectin;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String [] args) {
		LinkedHashSet ihs=new LinkedHashSet();
		ihs.add("vinay");
		ihs.add(100);
		ihs.add('A');
		ihs.add(100);
		ihs.add(null);
		ihs.add(null);
		//to entire print data
		System.out.println(ihs);
		//to size
		System.out.println(ihs.size());
		//empty
		System.out.println(ihs.isEmpty());
		
	}
	

}
