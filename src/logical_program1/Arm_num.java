package logical_program1;

public class Arm_num {
	public static void main(String [] args) {
   int num=371;
   int actnum=num;
   int r=0;
   int armnum=0;
   for(int i=1;i<=num;i++) {
	r=num%10;
	armnum=r*r*r+armnum;
	num=num/10;
	
	}
   if(actnum==armnum) {
	   System.out.println("no is armstrong");
   }
   else {
	   System.out.println("no is not armstorng");
   }
	}
}
