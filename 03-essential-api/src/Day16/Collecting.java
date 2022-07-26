package Day16;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collecting {

	public static void main(String[] args) {
		Student[] students = {
				new Student(10,"Cherry","Yangon"),
				new Student(2,"Cherry","Mandalay"),
				new Student(5,"Khaing","Monywa"),
				new Student(1,"Htet","Mandalay"),
				new Student(11,"Htet yadanar","Yangon")
		};
		
		
		Set<String> hashset = Arrays.stream(students)
									.map(Student::getName)
									.collect(Collectors.toSet());
		
		System.out.println("Hashset: " + hashset);
		
		TreeSet<Integer> treeset = Arrays.stream(students)
										.map(s -> s.getRno())
										.collect(Collectors.toCollection(TreeSet::new));
		
		
		Map<Integer, String> map_1 = Arrays.stream(students)
											.collect(Collectors.toMap(Student::getRno, Student::getName));
		
		Map<Integer, Student> map_2 = Arrays.stream(students)
											.filter(s -> !s.getCity().equals("yangon"))
											.collect(Collectors.toMap(
													s -> s.getRno(),
													s -> s)
													);
				
											
		System.out.println("Treeset: " + treeset);
//		System.out.println("List: " + list);
		System.out.println("map: " + map_1);
		System.out.println("Map2: " + map_2);
	}
}
