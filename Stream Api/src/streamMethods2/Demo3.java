package streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		
		//findAny()
		//List<String> stringList = Arrays.asList("one","two","three","one");
		//List<String> stringList = Arrays.asList();

		//Optional<String> ele=stringList.stream().findAny();
		//System.out.println(ele.get());//one  //NoSuchElementException
		
		
		//findFirst()
		//List<String> stringList = Arrays.asList("one","two","three","one");
		List<String> stringList = Arrays.asList();
		
		Optional<String> ele=stringList.stream().findFirst();
		
		System.out.println(ele.get());   //one  //NoSuchElementException
	}

}
