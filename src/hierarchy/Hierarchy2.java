package hierarchy;

public class Hierarchy2 {
public static void main(String [] args) {
	
	System.out.println("properties of Grandson1");
	Grandson1 s=new Grandson1() ;
		s.car();
		s.car2();
		s.money();
		
		System.out.println("properties of Grandson2");
		Grandson2 s1=new Grandson2();
		s1.car();
		s1.car3();
		s1.money();
		
		System.out.println("properties of Grandson3");
		Grandson3 s2=new Grandson3();
		s2.car();
		s2.car4();
		s2.money();
		
	
}
}
