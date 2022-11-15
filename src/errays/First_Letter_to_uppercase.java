package errays;

public class First_Letter_to_uppercase {
	public static void main(String [] args) {
		String name="my name is vinay dharmik";
		name=name.toLowerCase();
		String ar[]=null;
		String ss="";
		ar=name.split(" ");
		for(int i=0;i<ar.length;i++) {
			
			String ab=ar[i] .substring(0, 1) .toUpperCase()+ar[i] .substring(1);
			
			ss=ss+" "+ab;
			
		}
		ss=ss.substring(1);
		System.out.println(ss);
	}

}
