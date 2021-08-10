package flatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {
	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("Scott","David","John");
		List<String> teamB = Arrays.asList("Mary","Luna","Tom");
		List<String> teamC = Arrays.asList("Ken","Jony","Kitty");
		
		List<List<String>> finalTeam = new ArrayList<List<String>>();
		finalTeam.add(teamA);
		finalTeam.add(teamB);
		finalTeam.add(teamC);
		
		/*//Before Java8
		for(List<String> team:finalTeam) {
			for(String names:team) {
				System.out.println(names);
			}
		}*/
		
		finalTeam.stream().flatMap(pList->pList.stream()).forEach(n->System.out.println(n));
		//finalTeam.stream().flatMap(pList->pList.stream()).forEach(System.out::println);
		
		
	}
       
}
