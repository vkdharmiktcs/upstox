package hastable;

import java.util.Hashtable;

public class Hastables1 {
	public static void main(String [] args) {
		Hashtable<Integer,String>t=new Hashtable<Integer,String>();
		t.put(100, "vinay");
		t.put(101,"vivek");
		t.put(102, "aman");
		t.put(103, "anish");
		//print all data
		System.out.println(t);
		// print any one remove
	  t.remove(100);
	  System.out.println(t);
		
	}

}
