package Day16;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		
		List<User> users = List.of(
				new User("Kyaw Kyaw","Admin"),
				new User("Aung Aung","Staff"),
				new User("Maung Maung","Staff"),
				new User("Yuri","Coustomer"),
				new User("John","Coustomer")
				);
//		users.stream()
////			.filter(u -> u.getRole().equals("Staff"))
//			.filter(User::IsStaff)
//			.forEach(u -> {
//				System.out.println("User name: " + u.getName());
//				System.out.println("Role: " + u.getRole());
//			});
				
//		List<String> names = users.stream() //For Assignment
//									.filter(u -> u.getName().contains("aung") && u.getRole().equals("Staff"))
//									.map(u -> u.getName())
//									.collect(Collectors.toList());
//		System.out.println(names);
		
		Stream<Integer> numbers = Stream.iterate(1, i -> (i + 1))
										.limit(15);
		Predicate<Integer> evens = i -> i%2 == 0;
		numbers.filter(n -> (n > 4 && n <= 10 ))
				.filter(evens)
				.forEach(System.out::println);
	}
}
		
