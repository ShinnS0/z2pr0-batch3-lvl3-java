package Day6;

import java.util.Scanner;

public class Exception_handling_one {
	public static void main(String[] args) {
		try {
			Scanner sc = null;
			System.out.println("Enter Number1: ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("Enter number2: ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			var result = num1/num2;
			System.out.println("Result: " + result);
			sc.close();
		}
		catch(ArithmeticException obj1) {
			System.out.println("Divisor must not be zero");
		}
		catch(NumberFormatException obj2) {
			System.out.println("User input is not a number");
		}
		catch(Exception obj3) {
			System.out.println(obj3.getMessage());
		}
		System.out.println("Outside try catch block");
	}
	
	private static void display(int i) {
		
	}
}
