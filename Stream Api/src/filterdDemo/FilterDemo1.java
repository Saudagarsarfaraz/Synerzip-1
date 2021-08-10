package filterdDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer> evenNumberList = new ArrayList<Integer>();

		/*
		 * //without using streams 
		 * for(int n : numberList) { 
		 * if(n%2==0)
		 *      evenNumberList.add(n); 
		 * } 
		 * System.out.println(evenNumberList);
		 */

		// with streams
		/*
		 * evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList()); 
		 * System.out.println(evenNumberList);
		 */

		// numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

		numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
