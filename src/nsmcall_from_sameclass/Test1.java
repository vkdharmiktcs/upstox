package nsmcall_from_sameclass;

public class Test1 {
	public static void main(String [] args) {
		
		System.out.println("hi how are you");
		
		Test1.m1();
		Test1.m2();
		
		System.out.println("hi i am fine");
		
	}
	public static void  m1() {
		System.out.println("i am regular method m1");
	}
	public static void m2() {
		System.out.println("i am regular method m2");
	}

}
