package Day2;

import java.util.Scanner;

public class ConstanveVariable {
	
	static final float RATE = 2.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter Price: ");
		int Price = SC.nextInt();
		if(Price < MIN_PRICE) {
			Price = MIN_PRICE;
		}
		System.out.println("Price: " + Price);
		System.out.println("Expense: " + Price*RATE);
		//RATE = 3.5f;
		
	}
	
}
