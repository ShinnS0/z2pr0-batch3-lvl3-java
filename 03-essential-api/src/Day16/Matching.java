package Day16;

import java.util.List;

public class Matching {

	public static void main(String[] args) {
		var numbers = List.of(2,4,6,8,10);
		
		boolean result1 = numbers.stream().allMatch(i -> i%2 == 0);
		boolean result2 = numbers.stream().anyMatch(i -> i%2 == 0);
		boolean result3 = numbers.stream().noneMatch(i -> i%2 == 0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}	
}
