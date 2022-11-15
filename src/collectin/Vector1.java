package collectin;

import java.util.Vector;

public class Vector1 {
	public static void main(String [] args) {
		Vector v=new Vector();
		v.add("vivek");
		v.add(200);
		v.add('S');
		v.add(200);
		v.add(null);
		v.add(null);
		//to get all print data
		System.out.println(v);
		//to get size
		System.out.println(v.size());
		//to get empty
		System.out.println(v.isEmpty());
		//to insertion operation
		v.add(3,500);
		System.out.println(v);
		//to delete operation
		v.remove(3);
		System.out.println(v);
		
	}

}
