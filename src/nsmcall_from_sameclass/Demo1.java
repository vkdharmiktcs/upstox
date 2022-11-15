package nsmcall_from_sameclass;

public class Demo1 {
	public static void main (String [] args) {
		System.out.println("main method started");
		 Demo1 b= new Demo1();
		 b.m1();
		 b.m2();
		 
		 System.out.println("main method ended");
		 
	}
	public void m1() {
		System.out.println("i am m1 from non regular method class");
		
	}
	public void m2() {
		System.out.println(" iam m2 from non regular method class ");
		
	}

}
