package nsmcall_from_sameclass;

public class Run3 {
	public static void main(String [] args) {
		System.out.println(" i am working of mecl");
		 
		Run3 a=new Run3();
		a.m1();
		a.m2();
		
		System.out.println(" i am working of wcl");
		
		
		
	}
	public  void m1() {
		System.out.println(" i am non static regular method from m1");
		
	}
	public  void m2() {
		System.out.println("i am non static regular method from m2");
		
	}

}
