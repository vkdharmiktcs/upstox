package conditional_statement;

public class Switch {
	public static void main(String [] args) {
		switch("DOSA"){
			case "DOSA":{
				System.out.println("on monday");
				break;
				
			}
			case "IDLI":{
				System.out.println("on tusday");
				break;
				
			}
			case "idli":{
				System.out.println("on wendesday");
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
			case "lemon rice":{
				System.out.println("on saturday");
				break;
				
			}
			default:{
				System.out.println("on breakfast");
				break;
			}
		}
	}

}
