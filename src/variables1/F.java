package variables1;

public class F {
  static int g;//declaration
  
	public static void main(String[] args) {
	 int i=50;
	 i=20;
	 i=30;
	 i=40;
	 
	System.out.println(i);//40
	// without declaring variable try to print
	
	int j;//only declaration
	//System.out.println(j);//we have to initilize it
	
	//print global variable which is only declared
	System.out.println(g);//0

	}

}
