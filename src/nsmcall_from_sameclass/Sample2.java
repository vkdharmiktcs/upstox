package nsmcall_from_sameclass;

public class Sample2 {
	public static void main(String [] args) {
		System.out.println("main method started");
		
		Sample2 a=new Sample2();
		a.m1();
		a.m2();
		
		System.out.println("main method ended");
		
	}
	public void  m1() {
		System.out.println("i am from m1 regular non static method ");
		
	}
	public void  m2() {
		System.out.println("i am frm m2 regular non static method");
		
	}

}
