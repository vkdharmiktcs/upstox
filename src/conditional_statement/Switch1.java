package conditional_statement;

public class Switch1 {
	public static void main(String [] args) {
		switch("DOSA"){
			case "DOSA":{
				System.out.println("on monday");
				break;
				
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
				System.out.println("on thursday");
				break;
				
			}
			case "meduvada":{
				System.out.println("on friday");
				break;
				
			}
			case "lemon rice ":{
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
