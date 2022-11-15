package logicalprogram;

public class Test2 {
	public static void main(String [] args) {
		System.out.println("before swapping");
		int a=20;
		int b=30;
		System.out.println(a+"and"+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("after swapping"+a+""+b);
	}

}
