package nsm_call_from_different_class;

public class Test3 {
	public static void main(String [] args) {
		System.out.println("hi how are you");
		
		Test4 t=new Test4();
		t.t1();
		t.t2();
		
		
		System.out.println("hi i am fine ");
	}

}
