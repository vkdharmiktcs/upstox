package collectin;

import java.util.Vector;

public class VectorList {
	public static void main(String [] args) {
	 Vector vc=new Vector();
	 vc.add("vivek");
	 vc.add(100);
	 vc.add('A');
	 vc.add(100);
	 vc.add(null);
	 vc.add(null);
	 //to print data
	 System.out.println(vc);
	 //to get size
	 System.out.println(vc.size());
	 //to empty
	 System.out.println(vc.isEmpty());
	 //insertion operation
	 vc.add(3,500);
	 System.out.println(vc);
	 //delete operation
	 vc.remove(3);
	 System.out.println(vc);
	}

}
