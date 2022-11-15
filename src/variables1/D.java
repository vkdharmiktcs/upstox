package variables1;

public class D {
	static int a=10;// declaration

	public static void main(String[] args) {
		//reinitialization concept
		int i=20;
		i=30;
		i=40;
		i=50;
		
		 System.out.println(i);//50
		 //without declaring variable try to print 
		 
		 int h;//only declaration
		 //System.out.println(h);//we have to initialize it
		 
		 //print global variable which is only declared
		 
		 System.out.println(a);//10

	}

}
