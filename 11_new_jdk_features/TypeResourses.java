import java.util.List;
import java.util.Map;

public class TypeResourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var player = "messi";
		var goals = "773";
		var list = List.of("psg", "barca", "city");
		var map = Map.ofEntries(Map.entry("neymar", "psg"), Map.entry("TerStegen", "barca"),
				Map.entry("Mane", "bayern"));

		
		// allowed , they havent made var as keyword for backward compatibility reasons
		var var = "var";

		// not allowed , java determines type using initilized value
		// var player=55;

		System.out.println(player);
		System.out.println(goals);
		System.out.println(list);
		System.out.println(var);
		System.out.println(map);
	}

}
