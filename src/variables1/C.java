package variables1;

public class C {
	static int d;//declaration

	public static void main(String[] args) {
		//reinitialiazation concept
		int i=10;
		i=20;
		i=30;
		i=40;
		i=50;
		
		System.out.println(i);//50
		//without declaring variable try to print
		
		int a;//only declaration
		//System.out.print(a);//we have to initilize it
		
		//print global variable which is only declared
		
		System.out.print(d);//0

	}

}
