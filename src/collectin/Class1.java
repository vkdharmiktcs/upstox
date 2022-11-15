package collectin;

import java.util.ArrayList;

public class Class1 {
	public static void main(String [] args) {
		ArrayList a=new ArrayList();
		a.add("vinay");
		a.add(300);
		a.add('G');
		a.add(300);
		a.add(null);
		a.add(null);
		
		//to get print all the data
		System.out.println(a);
		//to get the size
		System.out.println(a.size());
		//to empty 
		System.out.println(a.isEmpty());
		//insertion operation
		a.add(2,400);
		System.out.println(a);
		//delete operation
	a.remove(2);
	System.out.println(a);
	}

}
