package nsm_call_from_different_class;

public class Test {
	public static void main(String [] args) {
		
		System.out.println("main method started");
		
		Test01 a=new Test01();
		a.t1();
		a.t2();
		
		
		System.out.println("main method ended");
		
	}

}
