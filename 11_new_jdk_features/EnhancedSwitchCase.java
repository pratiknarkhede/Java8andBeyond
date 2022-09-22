
public class EnhancedSwitchCase {

	public static void main(String[] args) {
		
		String player="muller";		
		
		switch(player) {
		case "messi","neymar" -> System.out.println("paris saint gemain");
		case "lewandoski","Frenkie" -> System.out.println("FC Barcelona");
		case "muller" -> System.out.println("bayern munich");
		case "ronaldo" -> System.out.println("manchester united");
		default -> System.out.println("make sure you entered correct player name");
		}
	}

}
