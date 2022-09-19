import java.util.*;
import static java.util.stream.Collectors.*;

public class Partition {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(numbers.stream()
      .collect(partitioningBy(e -> e % 2 == 0)));
  }
}