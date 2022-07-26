package Day15;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_testing2 {

	public static void main(String[] args) {
//		test_linkHahMap();
		test_treeMap();
	}

	private static void test_treeMap() {
		var file_extension = new TreeMap<String,String>();
		
		file_extension.put("java",".java");
		file_extension.put("php",".php");
	}

	private static void test_linkHahMap() {
		
		var students = new LinkedHashMap<Integer, String>();
		
		students.put(11, "Aung Aung");
		students.put(5, "Kyaw kyaw");
		students.put(8, "Hnin");
		
		students.putIfAbsent(10, "Cherry");
		
		System.out.println(students);
		
		students.replace(8, "Honey htun");
		System.out.println("Value of 0: " + students.get(8));
		
		students.remove(11);
		System.out.println("After remove: " + students.get(11));
	}
}
