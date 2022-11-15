package method_parameter;

public class Test {
	public static void main(String [] args) {
		
		addition(20.3,30.3,40.5f,20);
		
	}
	public static void addition(double d, double c, float f, int a) {
		double s=d+c+f+a;
		System.out.println(s);
	}

}
