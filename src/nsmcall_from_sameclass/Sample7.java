package nsmcall_from_sameclass;

public class Sample7 {
	public static void main(String [] args) {
		System.out.println("main method started");
		Sample7 a= new Sample7();
		a.m1();
		a.m2();
		
		 System.out.println("main method ended");
		 
	}
	public void m1() {
		System.out.println("i am in m1 regular non static method ");
		
	}
	public void m2() {
		System.out.println("i am in m2 regular non static method ");
		
	}

}
