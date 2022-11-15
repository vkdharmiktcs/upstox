package conditional_statement4;

public class Hotel_switch {
	public static void main(String [] args) {
		switch("IDLI") {
		case"IDLI":{
			System.out.println("on monday");
			break;
		}
		case"dosa":{
			System.out.println("on thusday");
			break;
		}
		case"meduvada":{
			System.out.println("on wednesday");
			break;
		}
		case"sambhar wada":{
			System.out.println("on thursday");
			break;
		}
		case"lemon rice":{
			System.out.println("on friday");
			break;
			
		}
		case"sabudana":{
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
