package mapDemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(2,3,4,5);
		
		numberList.stream().map(n->n*3).forEach(System.out::println);

	}

}
