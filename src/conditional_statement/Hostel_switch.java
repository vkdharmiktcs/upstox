package conditional_statement;

public class Hostel_switch {
	public static void main(String[]args) {
		
		switch("kamky"){
         case "DOSA":{
				System.out.println(" hi monday ");
				break;
				//System.out.println("hi guys gud morning all");
				
			}
         case "IDLI":{
        	 System.out.println("on tuesday");
        	 break;
         }
         case "idli":{
        	 System.out.println("on wednesday");
        	 break;
         }
         case "poha":{
        	 System.out.println(" on thursday");
        	 break;
        	 
         }
         case "meduvada":{
        	 System.out.println("on friday");
        	 break;
        		 
         }
         case "lemon rice":{
        	 System.out.println("on saturday");
        	 break;
        	 
         }
         default:{
        	 System.out.println("no breakfast");
        	 break;
         }
         		
         		
         		
		}
	}

}
