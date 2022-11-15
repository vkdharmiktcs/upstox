package hierarchy;

public class Hierarchy4 {
	public static void main(String [] args) {
		
		System.out.println("properties of brother1");
		Brother1 g=new Brother1();
		g.car();
		g.home();
		g.mobile();
		g.money();
		
		System.out.println("properties of brother2");
		Brother2 g1=new Brother2();
		g1.car();
		g1.home();
		g1.money();
		g1.laptop();
		
		System.out.println("properties of brother3");
		Brother3 g2=new Brother3();
		g2.bike();
		g2.home();
		g2.money();
		g2.car();
		
	}

}
