import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsInitialization {

	public static void main(String[] args) {

			
			List<Integer> list=List.of(1,2,3,4,5);
			
			
			//list.add(6); not allowed since List.of() is returning unmodifiable list
			System.out.println(list);
			
			//throws exception because of duplicate element
			//Set<Integer> set=Set.of(1,1,2,3,3,4,5);
			Set<Integer> set=Set.of(1,2,3,4,5);
			System.out.println(set);
			
			
			//or Map both the keys and values were supposed to be boxed
			Map<String,String> map=Map.ofEntries(Map.entry("lewandoski","barca"),
					Map.entry("neymar","psg")
					,Map.entry("TerStegen","barca")
					,Map.entry("Mane","bayern"));
			System.out.println(map);//notice we are directly able to print collection objects 
			
			
			
	}

}
