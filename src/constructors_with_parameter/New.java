package constructors_with_parameter;

public class New {
	String h;
	int a;
	int b;
	
	public static void main(String [] args) {
		New p=new New("vinay",20,30);
		p.math();
		
	}
	public void math() {
		int c=a+b;
		System.out.println(h);
		System.out.println(c);
		
	}
	
	public New(String d,int g, int v) {
	
		
{
this.h=d;
this.a=g;
this.b=v;
}
	}
}
