package flatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FlatMapDemo1 {
	public static void main(String[] args) {

		// map
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		list1.stream().map(n -> n + 10).forEach(System.out::print);
        
		System.out.println();
		
		// FlatMap
		List<Integer> lst1 = Arrays.asList(1, 2);
		List<Integer> lst2 = Arrays.asList(3, 4);
		List<Integer> lst3 = Arrays.asList(5, 6);

		List<List<Integer>> FinalList = Arrays.asList(lst1, lst2, lst3);

		FinalList.stream().flatMap(x -> x.stream().map(n -> n + 10)).forEach(System.out::print);
	}
}
