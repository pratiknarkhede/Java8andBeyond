
public class RecordTest {

	public static void main(String[] args) {
		Player player=new Player("Dembele", "FC Barcelona", 25);
		
		//we can directly get values from record using field name with () 
		// no need to define getter setters
		System.out.println(player.name());
		System.out.println(player.ClubName());
		System.out.println(player.goals());
	}

}
