package Day15;

import java.util.HashSet;
import java.util.Set;

public class Set_Testing {

	public static void main(String[] args) {
		
		var set1 = new HashSet<String>();
		
		set1.add("Orange");
		set1.add("Apple");
		set1.add(null);
		set1.add("Orange");
		set1.add("Mango");
		set1.add("Strawberry");
		
		System.out.println(set1);
		
		set1.remove("Apple");
		
		System.out.println("After remove " + set1);
		
		var set2 = Set.of("Potato", "Pineapple");
		
		// add collection
		
		set1.addAll(set2);
		
		System.out.println("After add all " + set1);
	}
}
