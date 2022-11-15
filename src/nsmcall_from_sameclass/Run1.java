package nsmcall_from_sameclass;

public class Run1 {
	public static void main(String [] args) {
		System.out.println("hi how are you ");
		
		Run1 a=new Run1();
		a.m1();
		a.m2();
		
		System.out.println(" hi i am fine ");
		
	}
	public void m1() {
		System.out.println("i am not static regular class m1");
		
	}
	public  void m2() {
		System.out.println("i am not static regular class m2");
		
	}

}
