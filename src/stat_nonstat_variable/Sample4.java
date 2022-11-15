package stat_nonstat_variable;

public class Sample4 {

		static int i=20;//static variable
		int j=30;//non-static variable
		
		public static void main(String [] args) {
			System.out.println(i);//
			
			Sample4 a=new Sample4();
			
			System.out.println(a.j);
			
	}

}
