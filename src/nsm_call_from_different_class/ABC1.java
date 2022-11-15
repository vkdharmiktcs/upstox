package nsm_call_from_different_class;

public class ABC1 {
	public static void main(String [] args) {
	 System.out.println("main method started");
	 
	 ABC2 n=new ABC2();
	 n.m1();
	 n.m2();
	 
	 
	 
	 System.out.println("main method ended");
	 
	}

}
