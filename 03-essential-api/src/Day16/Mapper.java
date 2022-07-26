package Day16;

import java.util.Arrays;
import java.util.List;

public class Mapper {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("John", 7800, "Monywa")
				);
		
		//
		List<String> distinctCities = empList.stream()
											.map(emp -> emp.getCity())
											.distinct()
											.toList();
		System.out.println(distinctCities);
		
		//
		int[] salaries = empList.stream()
				.filter(emp -> emp.getSalary() > 6000)
				.mapToInt(emp -> emp.getSalary())
				.toArray();	
		
		System.out.println(Arrays.toString(salaries)); //So faking important
		
		//
		List<Integer> SalaryList = empList.stream()
									.map(e -> e.getSalary())
									.filter(sal -> sal < 10000)
									.limit(3)
									.toList();
		
		System.out.println(SalaryList);
		
		//max min
		int max_sal = empList.stream()
							.mapToInt(e -> e.getSalary())
							.max()
							.getAsInt();
		
		int min_sal = empList.stream()
							.mapToInt(e -> e.getSalary())
							.min()
							.getAsInt();
		System.out.println("Max salary: " + max_sal);
		System.out.println("Min salary: " + min_sal);
	}
	
}
