package overriding;

public class Overriding3 {
	public static void main(String [] args) {
		
		System.out.println("old features");
		Vivo a=new Vivo();
		a.features();
		
		System.out.println("new features");
		Vivo1 b=new Vivo1();
		b.features();
		
	}

}
