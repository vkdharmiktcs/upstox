package nsmcall_from_sameclass;

public class Pratics {
	public static void main(String [] args) {
		
		System.out.println("main method started");
		
		Pratics a= new Pratics();
		a.m1();
		a.m2();
		a.m3();
		
		System.out.println("main method ended");
		
	}
	public void m1() {
		System.out.println("i am regular non static method m1");
		
	}
	public void m2() {
		System.out.println("i am regular non static method m2");
		
	}
	public void m3() {
		System.out.println("i am regular non static method m3");
		
	}

}
