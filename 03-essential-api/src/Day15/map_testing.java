package Day15;

import java.util.HashMap;
import java.util.Map;

public class map_testing {

	public static void main(String[] args) {
		
		test_hashMap();
	}

	private static void test_hashMap() {
		
		var foods = new HashMap<String, String>();
		
		foods.put("Oragne", "Fruit");
		foods.put("Grape", "Fruit");
		
		var another1 = Map.of("Mango","Fruit","Potato","Vegetable");
		
		foods.putAll(another1);
		
		System.out.println(foods);
		
		var another2 = Map.ofEntries(
				Map.entry("Coffee","Juice"),
				Map.entry("Lemon Tea","Juice")
				);
		foods.putAll(another2);
		
		//for each
		foods.forEach((k,v)-> {
			System.out.println(k + "->" + v);
		});
		
		foods.putIfAbsent("Coffee","juice");
		System.out.println("After new element " + foods);
		
		System.out.println("Contain 'Coffee': " + foods.containsKey("Coffee"));
		System.out.println("Contain 'icecream': " + foods.containsValue("icecream"));
		
		var keys = foods.keySet();
		
		System.out.println("All keys: " + keys);
		
		var values = foods.values();
		System.out.println("All values: " + values);
		
		System.out.println("Specified element: " + foods.get("Coffee"));
		System.out.println("Specified element: " + foods.get("abc"));
		
		//remove
//		foods.remove("Mango");
//		System.out.println("After remove: " + foods);
//		
//		foods.keySet().removeIf(k -> k.contains("Tea"));
//		System.out.println("After remove: " + foods);
		
		//update
		foods.replace("Mango","Athee");
		System.out.println("Value of mango: " + foods.get("Mango"));
		
		foods.compute("Coffee",(k,v)-> v.toUpperCase());
		System.out.println("Value of coffee: " + foods.get("Coffee"));
		
		foods.compute("Cake",(k,v)-> "Snack");
		System.out.println("After compute cake: " + foods);
		
		foods.computeIfAbsent("Orange",k -> "Juice");
		System.out.println("After computeifabsent: " + foods.get("Orange"));
		
		foods.computeIfAbsent("Banana",k-> "Fruit");
		System.out.println(foods);
		
		foods.computeIfPresent("Orange",(k,v) -> "Juice");
		System.out.println("Value of orange: " + foods.get("Orange"));
		
		foods.computeIfPresent("Corn",(k,v) -> "Vegetable");
		System.out.println("Value of corn: " + foods.get("Corn"));
	}
}
