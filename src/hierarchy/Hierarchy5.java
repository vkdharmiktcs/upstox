package hierarchy;

public class Hierarchy5 {
	public static void main(String [] args) {
		
		System.out.println("properties of version1");
		Version1 v=new Version1();
		v.software();
		v.text();
		v.update();
		
		System.out.println("properties of version2");
		Version2 v1=new Version2();
		v1.audio();
		v1.software();
		v1.update();
		
		System.out.println("properties of Version3");
		Version3 v2= new Version3();
		v2.software();
		v2.update();
		v2.video();
		
	}

}
