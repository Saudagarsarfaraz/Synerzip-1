package mapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Map {
	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				new Employee(101, "Alex", 10000),
				new Employee(102, "Divid", 20000),
				new Employee(103, "Brain", 30000),
				new Employee(104, "Edward", 40000),
				new Employee(104, "Charles", 50000)
				);
		emp.stream()
		           .filter(e->e.empSalary>20000)
		           .map(e->e.empSalary)
		           .forEach(System.out::println);
		
	}

}
