package collectin;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String [] args) {
		ArrayList al=new ArrayList();
		al.add("vinay");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		//print to all data
		System.out.println(al);
		// to get size
		System.out.println(al.size());
		// to empty
		System.out.println(al.isEmpty());
		//insertion operation
		al.add(2,"suresh");
		System.out.println(al);
		//delete operation
		al.remove(2);
		System.out.println(al);
	}

}
