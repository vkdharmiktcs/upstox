package conditional_statement;

public class Switch4 {
	public static void main(String [] args) {
		switch("IDLI") {
		case"PAINDOSA":{
			System.out.println("on monday");
			break;
		}
		case "idli":{
			System.out.println("on tuesday");
			break;
		}
		case "poha":{
			System.out.println("on wednesday");
			break;
		}
		case "meduvada":{
			System.out.println("on thursday");
			break;
		}
		case "sambhar wada":{
			System.out.println("on friday");
			break;
		}
		case "samosa":{
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
