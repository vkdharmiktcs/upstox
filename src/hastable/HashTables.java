package hastable;

import java.util.Hashtable;

public class HashTables {
	public static void main(String [] args) {
		Hashtable<Integer,String>t=new Hashtable<Integer,String>();
		t.put(101,"vinay");
		t.put(102,"vivek");
		t.put(103,"aman");
		t.put(104, "anish");
		//print all data
		System.out.println(t);
		// remove any one entry 
		t.remove(102);
		System.out.println(t);
		t.remove(103);
		System.out.println(t);
	}

}
