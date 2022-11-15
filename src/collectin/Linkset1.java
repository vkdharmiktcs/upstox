package collectin;

import java.util.LinkedList;

public class Linkset1 {
	public static void main(String [] args) {
		LinkedList a=new LinkedList();
		a.add("aishwarya");
		a.add(200);
		a.add('A');
		a.add(null);
		a.add(null);
		a.add(200);
		System.out.println(a);
		//to get size
		System.out.println(a.size());
		//to empty
		System.out.println(a.isEmpty());
		//to get  insertion operation
	    a.add(1,"mitali");
	    System.out.println(a);
	    //to remove
	    a.remove(1);
	    System.out.println(a);
		}

}
