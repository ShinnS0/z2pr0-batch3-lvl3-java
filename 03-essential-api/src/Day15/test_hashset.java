package Day15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class test_hashset {
	
static void test_hashset() {
		
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
	public static void test_treeset() {
		test_treeset();
		
	}

	public static void test_hashset(String[] args) {
		
		test_LinkHashSet();
	}

	private static void test_LinkHashSet() {
		
		var set1 = new LinkedHashSet<String>();
		
		//add an element
		set1.add("Orange");
		set1.add("Apple");
		set1.add(null);
		set1.add("Orange");
		set1.add("Mango");
		set1.add("Strawberry");
		
		System.out.println(set1);
		
//		System.out.println(str -> str != null && str.toLowerCase().contain("0"));
		
	}
}
