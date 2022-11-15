package nsmcall_from_sameclass;

public class Sample4 {
	public static void main(String [] args) {
		System.out.println("welcome to you java");
		Sample4 d= new Sample4();
		d.m1();
		d.m2();
		
		System.out.println("Thank you java");
		
	}
	public void m1() {
		System.out.println("i am m1 from regular non static method ");
		
	}
	public void m2() {
		System.out.println("i am m2 from regular non static method ");
		
	}

}
