package nsm_call_from_different_class;

public class D {
	public static void main(String [] args) {
		System.out.println("i go to village");
		
		E a=new E();
		a.t1();
		a.t2();
		
		
		System.out.println("i go to my hometown");
		
	}

}
