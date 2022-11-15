package nsm_call_from_different_class;

public class A {
	public static void main(String [] args) {
		System.out.println("main method started");
		
		B a=new B();
		a.m1();
		a.m2();
		
		
		
		System.out.println("main method ended");
		
	}

}
