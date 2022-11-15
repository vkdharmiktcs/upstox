package nsm_call_from_different_class;

public class Demo3 {
	public  void main(String [] args) {
		System.out.println("main method started");
		
		Demo4 s= new Demo4();
		s.m1();
		s.m2();
		
		
		
		System.out.println("main method ended");
	}
}

		

