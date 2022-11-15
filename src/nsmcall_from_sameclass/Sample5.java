package nsmcall_from_sameclass;

public class Sample5 {
	public static void main(String [] args) {
		System.out.println("welcome to you java");
		Sample5 a= new Sample5();
		a.m1();
		a.m2();
		
		System.out.println("Thank you to java");
		
	}
	public void m1() {
		System.out.println("i am m1 from regular non static method ");
		
	}
	public void m2() {
		System.out.println("i am m2 from regular non static method ");
		
	}

}
