package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Distinct()
//Limit()
//count

public class Demo1 {
     public static void main(String[] args) {
		List<String> vehicleList = Arrays.asList("bus","car","bicycle","car","bus","car","bike");
    	
//		List<String> list = vehicleList.stream().distinct().collect(Collectors.toList());
//		System.out.println(list);
		
		vehicleList.stream().distinct().forEach(System.out::println); 
	    
		long count = vehicleList.stream().distinct().count();
	    System.out.println(count); 
	    
	    List<String> list1 = vehicleList.stream().limit(3).collect(Collectors.toList());
	    System.out.println("Limited vehicles:"+list1);    
     }  
}
