package Day3;

import java.util.Scanner;

public class Switch_expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name :");
		String name = sc.nextLine();
		
//		String category = switch(name){
//				case "burger", "pizza", "sandwich" -> "Fast food";
//				case "Milktea", "yogurt" -> "Dessert";
//				case "mohinga" -> "Burmese food";
//				case "sushi" -> "Japanese food";
//				default -> "Unknown";
//		};
		
		var category = switch(name){
				case "burger","pizza","sandwich" -> {
					if(name.equals("pizza"))
						System.out.println(name + " is italian food.");
					yield "fast food";
				} 
				case "milktea", "yogurt" -> {
					yield "Dessert";
				}
				case "mohinga" -> "Burmese food";
				case "sushi" -> "Japanese food";
				default -> "Unknown";
		};
		System.out.println(name + " is " + category);
	}
	
}
