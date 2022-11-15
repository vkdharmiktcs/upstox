package overriding;

public class Overriding4 {
	public static void main(String [] args) {
		
		System.out.println("share for son1");
		Son1 s=new Son1();
		s.share();
	
	System.out.println("share for son2");
	Son2 s1=new Son2();
	s1.share();
	
	System.out.println("share for son3");
	Son3 s2=new Son3();
	s2.share();
	
	
	}
}
