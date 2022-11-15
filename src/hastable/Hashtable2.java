package hastable;

import java.util.Hashtable;

public class Hashtable2 {
	public static void main(String [] args) {
		Hashtable<Integer,String>t=new Hashtable<Integer,String>();
		t.put(101, "aman");
		t.put(102, "bablo");
		t.put(103,"chanda" );
		t.put(104, "dinesh");
		// t0 get all print data
		System.out.println(t);
		t.remove(102);
		System.out.println(t);
	}

}
