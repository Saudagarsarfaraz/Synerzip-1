package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	public static void main(String[] args) {
		
		List<String> vehicals = Arrays.asList("bus","car","bicycle","train","flight");
		List<String> vehicalsListinUpperCase = new ArrayList<String>();
		
		/*//without using streams
		for (String str : vehicals) {
			vehicalsListinUpperCase.add(str.toUpperCase());
		}*/
		
		vehicalsListinUpperCase=vehicals.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		
		
		System.out.println(vehicalsListinUpperCase);
		
	}

}
