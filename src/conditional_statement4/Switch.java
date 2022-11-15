package conditional_statement4;

public class Switch {
	public static void main (String [] args) {
		switch ("dosa") {
		case "IDLI":{
			System.out.println("on monday");
			break;

		}
		case "dosa":{
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
		case"sambhar wada":{
			System.out.println("on friday");
			break;
		}
		case"lemon rice":{
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
