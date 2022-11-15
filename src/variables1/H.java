package variables1;

public class H {
	static int a;//declaration

	public static void main(String[] args) {
	//reinitialization concept
		int i=10;
		i=20;
		i=30;
		i=40;
		 
		System.out.println(i);//40
		//without declaration variable try to print
		
		int j;//only declaration
		//System.out.println(j);//we have to initialize it
		 
		//print global variable which is only declared
		
		System.out.println(a);//0
		

	}

}
