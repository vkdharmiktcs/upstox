package stat_nonstat_variable;

public class Sample5 {
	
	static int i=50;//static variable
	int a=100;//non static variable
	
	public static void main(String [] args) {
		System.out.println(i);
		
		Sample5 s=new Sample5();
		
		System.out.println(s.a);
		
	}
	
	

}
