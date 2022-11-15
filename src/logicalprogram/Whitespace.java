package logicalprogram;

public class Whitespace {
	public static void main(String [] args) {
       String name=" V I N A Y A I S H W A R I Y A D H A R M I K";
       int count=0;
     for(int i=0;i<=name.length()-1;i++) {
    	 char ch=name.charAt(i);
    	 if(ch==' ') {
    		 count++;
    		 
    	 }
     }
     System.out.println(count);
	}

}
