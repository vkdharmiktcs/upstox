package collectin;

import java.util.LinkedList;

public class LinkedList_2 {
	public static void main(String [] args) {
		LinkedList ls=new LinkedList();
		ls.add("vinay");
		ls.add(100);
		ls.add('A');
		ls.add(100);
		ls.add(null);
		ls.add(null);
		//print to all data
		System.out.println(ls);
		// to get size
		System.out.println(ls.size());
		//to empty
		System.out.println(ls.isEmpty());
		//insertion operation
		ls.add(1,"vivek");
		System.out.println(ls);
		//delete operation
		ls.remove(1);
		System.out.println(ls);
	}

}
