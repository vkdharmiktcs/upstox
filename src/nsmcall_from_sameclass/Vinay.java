package nsmcall_from_sameclass;

public class Vinay {
	public static void main(String [] args) {
		System.out.println(" main method started");
		
		Vinay a=new Vinay();
		a.m1();
		a.m2();
		a.m3();
		
		System.out.println("main method ended");
		
	}
	public void m1() {
		System.out.println(" i am from non regular static method m1");
		
	}
	public void m2() {
		System.out.println("i am from non regular static  method m2");
		
	}
	public void m3() {
		System.out.println("i am from non regular static method m3");
		
	}

}
