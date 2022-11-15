package method2;

public class SRM_call_from_sameclass2 {
	public static void main(String [] args) {
		System.out.println("main method started");
		m1();
		m2();
		m3();
		
		System.out.println("main method ended");
		
	}
	public static void m1() {
		System.out.println("i am running from main method m1");
		
	}
	public static void m2() {
		System.out.println("i am running from mai method m2");
		
	}
	public static void m3() {
		System.out.println("i am running from main method m3");
		
	}

}
