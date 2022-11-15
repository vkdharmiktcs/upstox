package nsmcall_from_sameclass;

public class Demo {
	public static void main(String [] args) {
		
		System.out.println("hi how are java");
		Demo s= new Demo();
		s.m1();
		s.m2();
		
		System.out.println(" i am fine you java");
		
	}
	public void m1() {
		System.out.println("i am m1 from non regular method class");
		
	}
	public void m2() {
		System.out.println("i am m2 from non regular method class");
		
	}

}
