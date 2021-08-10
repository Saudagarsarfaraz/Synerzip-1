package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		//reduce  
		Optional<String> reduce = stringList.stream().reduce((value,combinedvalue)->{
			                         return combinedvalue+value;
		                             });
		System.out.println(reduce.get());
		
		//toArray
		Object[] array = stringList.stream().toArray();
		System.out.println(array.length);
		
		for(Object arr:array) {
			System.out.println(arr);
		}
		
	}

}
