package nsmcall_from_sameclass;

public class Run2 {
	public static void main(String [] args) {
		System.out.println("hi how are you java");
		
		Run2 a =new Run2();
		a.m1();
		a.m2();
		
		System.out.println("hi am fine of java");
	
	}
	public  void m1() {
		System.out.println("i am running from regular non static method m1");
		
		
	}
	public  void m2() {
		System.out.println(" i am running from regular non static method m2");
		
		
	}

}
