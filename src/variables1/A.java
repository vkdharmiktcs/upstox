package variables1;

public class A {
	static int k;//declaration

	public static void main(String[] args) {
		//reinitialization concept
		
		int i=10;
		i=20;
		i=30;
		i=40;
		i=50;
		i=60;
		
		System.out.println(i);//60
		//without declaring variable try to print
		
		int j;//only declaration
		//System.out.print(j);//we have to initilize it 
		
		//print global variable which is only declared
		
		System.out.println(k);//0
		

	}

}
