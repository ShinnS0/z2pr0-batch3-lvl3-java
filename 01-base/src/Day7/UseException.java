package Day7;

import java.util.Scanner;

public class UseException {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter your age: ");
			var age = sc.nextInt();
			validateAge(age);
		}
		catch (InvalidAgeException e){
			System.err.println(e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		
		if(age < 18) {
			throw new InvalidAgeException("Age must be at least 18!");
		}
		else {
			System.out.println("You can smoke.");
		}
	}
	// enterprise = security + reliability + multiuser + scalability
}

class InvalidAgeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
	public InvalidAgeException() {
		
	}
}