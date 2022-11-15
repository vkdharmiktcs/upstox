package nsmcall_from_sameclass;

public class Sample6 {
	public static void main (String [] args) {
		System.out.println(" i how are you java");
		
		Sample6 a=new Sample6();
				a.m1();
		a.m2();
		
		System.out.println("i fine to you java");
		
	}
	public void m1() {
		System.out.println(" i am from m1 regular non static method");
		
	}
	public void m2() {
		System.out.println("i am from m2 regular non static method ");
		
	}
		

}
