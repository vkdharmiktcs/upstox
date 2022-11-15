package conditional_statement;

public class Switch5 {
	public static void main(String [] args) {
		switch("IDLI") {
		case"IDLI":{
			System.out.println("on monday");
			break;
		}
		case "dosa":{
			System.out.println("on tuesday");
			break;
		}
		case "masala dosa":{
			System.out.println("on wednesday");
			break;
		}
		case "meduvada":{
			System.out.println("on thursday ");
			break;
		}
		case "sambhar wada":{
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
