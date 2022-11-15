package nsmcall_from_sameclass;

public class Run {
	public static void main(String [] args) {
		System.out.println("hi how are you java");
		Run b=new Run();
		b.m1();
		b.m2();
		b.m3();
		
		System.out.println("i fine you java");

	}
	public void m1() {
		System.out.println("i am  regular non static m1");
		
	}
	public void m2() {
		System.out.println("i am regular non static m2");
		
	}
	public void m3() {
		System.out.println("i am regular non static m3");
		
	}
	

}
