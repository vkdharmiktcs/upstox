package nsm_call_from_different_class;

public class B1 {
	public static void main(String [] args) {
		
		System.out.println("i am from nagpur ");
	
		B1 a=new B1();
		a.t1();
		a.t2();
		a.t3();
		
		System.out.println("i am from mumbai");
		
	}
	public void t1() {
		System.out.println("i am non static method t1");
		
	}
	public void t2() {
		System.out.println("i am non static method t2");
	}
	public void t3() {
		System.out.println("i am non static method t3");
		
	}

}
