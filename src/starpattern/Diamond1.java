package starpattern;

public class Diamond1 {
	
	//               *
	//             * * *
	//           * * * * *
	//         * * * * * * *
	//       * * * * * * * * *
	//         * * * * * * *
	//           * * * * *
	//             * * *
	//               *
	 
	public static void main(String [] args) {
		int space=4;
		int star=1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=3) {
				space--;
				star=star+2;
				
			}
			else {
				space++;
				star=star-2;
				
			}
		}
	}

}
