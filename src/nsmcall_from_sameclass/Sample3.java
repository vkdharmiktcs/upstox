package nsmcall_from_sameclass;

public class Sample3 {
	public static void main(String [] args) {
		
		System.out.println("main method started");
		
		Sample b=new Sample ();
		b.m1();
		b.m2();
		
		
		System.out.println("main method ended");
		
	}
	public void m1() {
		System.out.println("i how m1 are you");

	}
	public void m2() {
		System.out.println(" i am  m2 fine ");
		
	

		
	}
	

}
