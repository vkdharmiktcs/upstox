package overriding;

public class Method_overriding {
	public static void main(String [] args) {
		
		System.out.println("talk of cat");
		Cat c=new Cat();
		c.talk();
		
		System.out.println("talk of dog");
		Dog g=new Dog();
		g.talk();
		
	}

}
