package overriding;

public class Overriding2 {
	public static void main(String [] args) {
		
		System.out.println("talk of elephant");
		Elephant c=new Elephant();
		c.talk();
		
		System.out.println("talk of lion");
		Lion a=new Lion();
		a.talk();
		
	}

}
