package nsm_call_from_different_class;

public class Demo1 {
	public static void main(String [] args) {
		System.out.println("main method started");
		
		Demo2 s= new Demo2();
		s.m1();
		s.m2();
		
		
		
		System.out.println("main method ended");
		
	}

}
