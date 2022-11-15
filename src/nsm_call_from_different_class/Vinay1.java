package nsm_call_from_different_class;

public class Vinay1 {
	public static void main (String [] args) {
		System.out.println("main method started");
		Vinay2 a= new Vinay2();
		a.m1();
		a.m2();
		
		
		
		
		System.out.println("main method ended");
		
	}

}
