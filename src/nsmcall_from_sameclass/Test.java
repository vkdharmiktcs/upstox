package nsmcall_from_sameclass;

public class Test {
	public static void main(String [] args) {
		System.out.println("i am from nagpur");
		
		
		Test a=new Test();
		a.t1();
		a.t2();
		a.t3();
		
		System.out.println("i am from mumbai");
	}
	public void t1() {
		System.out.println("i am non static regular method from t1");
	}
	public void t2() {
		System.out.println("i am non static regular method from t2");
	}
	public void t3() {
		System.out.println("i am non static regular method from t3");
	}

}
