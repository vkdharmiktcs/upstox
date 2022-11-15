package variables1;

public class Global_without_initialization {
	static byte b;
	static int i;
	static short s;
	static long l;
	static double d;
	static float f;
	static char ch;
	static boolean bl;
	static String v;
	

	public static void main(String[] args) {
	System.out.println(b);//0
	System.out.println(i);//0
	System.out.println(s);//0
	System.out.println(l);//0
	System.out.println(d);//0.0
	System.out.println(f);//0.0
	System.out.println(ch);//empty box
	System.out.println(b);//true
	System.out.println(v);//null

	}

}
