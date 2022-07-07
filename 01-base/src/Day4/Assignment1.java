package Day4;

import java.util.Scanner;

public class Assignment1 {

		public static void main(String[] args) {
			
			int pos=0 ,nge=0 ,zero = 0;
			
			System.out.print("Enter how many u want to type: ");
			Scanner data = new Scanner(System.in);
			int user_input = data.nextInt();
			
			for(var i = 0; i < user_input; i++) {
				System.out.print("Enter any number: ");
				Scanner num = new Scanner(System.in);
				int type = num.nextInt();
				
				if(type>0) {
					pos++;
				}else if(type < 0) {
					nge++;
				}else {
					zero++;
				}
			};
			System.out.println("__________________________");
			System.out.println("Positive  numbers: " + pos);
			System.out.println("Negative numbers: " + nge);
			System.out.println("Zero numbers: " + zero);
		}
}
