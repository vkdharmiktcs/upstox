package collectin;

import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String [] args) {
		TreeSet s=new TreeSet();
		s.add(800);
		s.add(100);
		s.add(300);
		s.add(500);
		s.add(200);
		s.add(700);
		s.add(400);
		s.add(600);
		System.out.println(s);
		//to last number
		s.pollLast();
		System.out.println(s);
		//to first number
		s.pollFirst();
		System.out.println(s);
	}

}
