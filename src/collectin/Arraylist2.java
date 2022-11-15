package collectin;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String [] args) {
		ArrayList al=new ArrayList();
		al.add("vinay");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		//to get entire print data
		System.out.println(al);
		//to get size
		System.out.println(al.size());
		//to empty
		System.out.println(al.isEmpty());
		// to insertion operation
		al.add(2,"vivek");
		System.out.println(al);
		//to delete operation
		al.remove(2);
		System.out.println(al);
	}

}
