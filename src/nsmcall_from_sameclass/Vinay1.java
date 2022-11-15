package nsmcall_from_sameclass;

public class Vinay1 {
	public static void main(String [] args) {
		
		System.out.println("hi how are you");
		
		Vinay1 s=new Vinay1();
		s.t1();
		s.t2();
		s.t3();
		System.out.println("hi i am fine you");
		
	}
	public void t1() {
		System.out.println("i am non static method regular class t1");
		
	}
	public void t2() {
		System.out.println("i am non static method regular class t2");
		
	}
	public void t3() {
		System.out.println("i am non static method regular class t3");
		
	}

}
