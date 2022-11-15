package conditional_statement;

public class Switch3 {
	public static void main(String [] args) {
		switch("MEDUVADA") {
		case "MEDUVADA":{
			System.out.println("on monday");
			break;
		}
		case "Idli":{
			System.out.println("on tuesday");
			break;
		}
		case"poha":{
			System.out.println("on wednesday");
			break;
		}
		case "uttapum":{
			System.out.println("on thursday");
			break;
		}
		case "lemon rice":{
			System.out.println("on friday");
			break;
			
		}
		case"sambhar wada":{
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
