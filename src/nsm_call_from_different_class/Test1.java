package nsm_call_from_different_class;

public class Test1 {
	public static void main(String [] args) {
		System.out.println(" main method is started");
		Test2 a=new Test2();
		a.t1();
		a.t2();

		
		System.out.println("main method is ended");
		
	}

}
