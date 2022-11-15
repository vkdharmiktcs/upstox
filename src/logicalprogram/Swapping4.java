package logicalprogram;

public class Swapping4 {
	public static void main(String [] args) {
		System.out.println("before swapping ");
		int a=20;
		int b=40;
		
		System.out.println(a+" and "+b);
		
		//by using 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping");
		System.out.println(a+" and "+b);
	}

}
