package mapDemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		List<String> vehicals = Arrays.asList("bus","car","bicycle","train","flight");
	    
		/*//without Streams
		for(String name:vehicals) {
			System.out.println(name.length());
		}*/
		
		/*List<Integer> vehicalsListinUpperCase = vehicals.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(vehicalsListinUpperCase);*/
		
		vehicals.stream().map(n->n.length()).forEach(System.out::println);
		
		
	
	
	
	}

}
