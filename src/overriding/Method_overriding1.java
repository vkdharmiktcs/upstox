package overriding;

public class Method_overriding1 {
	public static void main(String [] args) {
		
		System.out.println("sound of JBL");
		JBL j=new JBL() ;
		j.sound();
		
		
		System.out.println("sound of boat");
			Boat a=new Boat();
			a.sound();
			
		
	}

}
