package Day6;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		String user_input;	
		System.out.print("Enter something: ");
		Scanner sc = new Scanner(System.in);
		user_input = sc.nextLine();
		String [] data = user_input.split(" ");
		Boolean data1 = user_input.endsWith("?");
		String start = data[0];
		String middle = data[1];
		
		Boolean past1 = user_input.startsWith("Do");
		Boolean past2 = user_input.startsWith("Does");
		Boolean past3 = user_input.startsWith("Wh");
		
//		System.out.println("End with '?': " + user_input.endsWith("?"));
		if(data1 == true) {
			System.out.println("This is a question!");
			System.out.println("First word of this sentence is: " + start);
			if(start.equalsIgnoreCase("Do") || start.equalsIgnoreCase("Does")) {
				System.out.println("This sentence is simple present tense!");
			}else{
				System.out.println("This sentence is not simple present tense!");
			}
		}else{
			System.out.println("This is not a question!");
		}
		
	}
}
