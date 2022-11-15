package nsmcall_from_sameclass;

public class Class1 {
	public static void main(String [] args) {
		System.out.println("main method started");
		Class1 a= new Class1();
		a.m1();
		a.m2();
		
		System.out.println("main method ended");
		
	}
	public  void m1() {
		System.out.println("i am running from m1 non regular method ");
		
	}
	public  void m2() {
		System.out.println("i am running from m2 non regular method");
		
	}

}
