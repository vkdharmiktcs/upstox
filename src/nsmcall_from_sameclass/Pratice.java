package nsmcall_from_sameclass;

public class Pratice {
	public static void main(String [] args) {
		System.out.println("i am from nagpur ");
		
		Pratice a=new Pratice ();
		a.t1();
		a.t2();
		a.t3();
		
		System.out.println("i am from mumbai");
		
	}
	public void t1() {
		System.out.println("i nonstatic regular method t1");
	}
	public void t2() {
		System.out.println("i nonstatic regular method t2");
		
	}
	public void t3() {
		System.out.println("i nonstatic regular method t3");
		
	}

}
