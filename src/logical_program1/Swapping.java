package logical_program1;

public class Swapping {
	public static void main(String [] args) {
		System.out.println("berfore swapping");
		int a=20;
		int b=30;
		System.out.println(a+" "+b);
	
	 a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println(a+" "+b);
	}

}
