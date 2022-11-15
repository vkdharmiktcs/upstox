package conditional_statement;

public class Switch2 {
	public static void main(String [] args) {
		switch("IDLI") {
		case "IDLI":{
			System.out.println("on monday");
			break;
		}
		case "Dosa":{
			System.out.println("on tuesday");
			break;
		}
		case "dosa":{
			System.out.println("on wednesday");
			break;
		}
		case "uttapum":{
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
