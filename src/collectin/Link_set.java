package collectin;

import java.util.LinkedList;

public class Link_set {
	public static void main(String [] args) {
		LinkedList ll=new LinkedList();
		ll.add("vinay");
		ll.add(100);
		ll.add('A');
		ll.add(null);
		ll.add(null);
		ll.add(100);
		
		//to entire print data
		System.out.println(ll);
		//to get size
		System.out.println(ll.size());
		//check empty 
		System.out.println(ll.isEmpty());
		//insertion opertion
		ll.add(1,"vivek");
		System.out.println(ll);
		//delete operation
		ll.remove(1);
		System.out.println(ll);
		
		
	}

}
