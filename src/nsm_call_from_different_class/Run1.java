package nsm_call_from_different_class;

public class Run1 {
	public static void main(String [] args) {
		System.out.println("main method started");
		 Run2 a=new Run2();
		 
		 a.m1();
		 a.m2();
		 
		
		
		System.out.println("main method ended");
		
	}
	

}
