package Day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reduction {

public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("John", 7800, "Monywa")
				);
		
		int total = empList.stream().mapToInt(e -> e.getSalary()).sum();
		double avg = empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		int max_salary = empList.stream().mapToInt(e -> e.getSalary()).max().getAsInt();
		long count = empList.stream().filter(e -> e.getSalary()>6000).count();
		Employee max_emp = empList.stream().max(Comparator.comparingInt(e -> e.getSalary())).get();
		Employee min_emp = empList.stream().min((e1,e2)-> e1.getSalary() - e2.getSalary()).get();
		
		
		System.out.println("No of Who got salary: " + count);
		System.out.println(avg);
		System.out.println(max_salary);
		System.out.println(total);
		System.out.println("Max whose salary: " + max_emp);
		System.out.println("Min whose salary: " + min_emp);
		
		
		//custom reducing
		int totalsal = empList.stream()
							.map(Employee::getSalary)
							.reduce(0, (s1,s2)-> s1 + s2);
		
		int minSalary = empList.stream()
								.mapToInt(e -> e.getSalary())
								.reduce(Integer::min)
								.getAsInt();
								
		max_emp = empList.stream()
						.reduce((e1,e2)-> e1.getSalary() < e2.getSalary()? e2 : e1)
						.get();
		
		System.out.println("Min salary: " + minSalary);
		System.out.println("Min salary; " + Integer.min(100,200));
		System.out.println("Total: " + totalsal);
		System.out.println("Max salary with employee: " + max_emp);
	}
}
