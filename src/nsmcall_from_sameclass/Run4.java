package nsmcall_from_sameclass;

public class Run4 {
	public static void main(String [] args) {
		System.out.println(" nagpur is capital of vidharbha ");
		Run4 a=new Run4();
		a.t1();
		a.t2();
		
		System.out.println(" mumbai is capital of maharashtra");
		
		
	}
	public void t1() {
		System.out.println("i am non static regular method t1");
		
	}
	public void t2() {
		System.out.println("i am non static regular method t2");
		
	}

}
