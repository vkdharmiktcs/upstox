package nsmcall_from_sameclass;

public class Java {
	public static void main(String [] args) {
		System.out.println("hi how you java");
		
		Java a=new Java();
		a.t1();
		a.t2();
		a.t3();
		
		System.out.println("hi i am fine ");
		
	}
	public void t1() {
		System.out.println("i from non static method t1");
		
	}
	public void t2() {
		System.out.println("i from no static method t2");
		
	}
	public void t3() {
		System.out.println(" i from non static method t3");
		
	}
	


}
