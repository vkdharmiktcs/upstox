package collectin;

import java.util.LinkedList;

public class Linkset3 {
	public static void main(String [] args) {
		LinkedList sh=new LinkedList();
		sh.add("Pradip");
		sh.add(100);
		sh.add('A');
		sh.add(100);
		sh.add(null);
		sh.add(null);
		//to get entire print data
		System.out.println(sh);
		//to get size
		System.out.println(sh.size());
		//to empty
		System.out.println(sh.isEmpty());
		//to insertion operation
	sh.add(1,"suresh");
	System.out.println(sh);
	//to delete 
	sh.remove(1);
	System.out.println(sh);
	}

}
