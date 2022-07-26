package Day17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Day16.Employee;

public class Grouping {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("John", 7800, "Monywa")
				);
		
		//count
		Map<String, Long> counting = empList.stream()
											.collect(					//key
											Collectors.groupingBy(Employee::getCity, Collectors.counting())		
													);
		
		//sum
		Map<String, Integer> sum = empList.stream()
											.collect(					//key								//value
											Collectors.groupingBy(e -> e.getCity(), Collectors.summingInt(Employee::getSalary))
													);
		
		//average in each city
		Map<String, Double> avg = empList.stream()
											.collect(					//key								//value	e -> e.getSalary(
											Collectors.groupingBy(e -> e.getCity(),Collectors.averagingDouble(Employee::getSalary))
													);
		
		System.out.println("Counting: " + counting);
		System.out.println("Summing: " + sum);
		System.out.println("Avearge: " + avg);
		//_______________________________________
		
		//employees who got the same salary
		Map<Integer, List<Employee>> same_sal = empList.stream()						//key
														.collect(Collectors.groupingBy(Employee::getSalary));
		
		same_sal.forEach((key,value) -> {
			System.out.println(key + "ks.");
			value.forEach(emp -> {
				System.out.println("\t" + emp.getName() + "(" + emp.getCity()+ ")");
			});
		});
		
		//_________Employees Names in each cities__________
		Map<String, List<String>> same_city = empList.stream()
												.collect(
												Collectors.groupingBy(Employee::getCity,
												Collectors.mapping(
														e -> e.getName(),
														Collectors.toList()
														)
													)
												);
		System.out.println("Employee name in each city");
		same_city.forEach((k,v)-> {
			System.out.println(k);
			v.forEach(name -> System.out.println("\t" + name));
		});
		
		//Employees who stay in the same city
		Map<String, List<Employee>> sameCity = empList.stream()
													.collect(
													Collectors.collectingAndThen(
															Collectors.groupingBy(Employee::getCity),//Map<Integer, List<Employee>>
															map -> map.entrySet()//	(String, Set<Emploee>)
															.stream()
															.filter(emp -> emp.getValue().size() > 1)//filter list > 1	
															.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()))
															)
													);
													
		System.out.println("Employees who stay in the same city");
		sameCity.forEach((k,v)-> {
			System.out.println(k);
			v.forEach(emp -> System.out.println("\t" + emp.getName()));
		});
	}
}
