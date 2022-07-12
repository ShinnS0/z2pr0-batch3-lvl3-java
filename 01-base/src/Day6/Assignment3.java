package Day6;

import java.text.ParsePosition;
import java.util.Scanner;

public class Assignment3 {
		
	public static void main(String[] args) {
		
		System.out.print("Enter your NRC No.: ");
		Scanner sc = new Scanner(System.in);
		String NRC = sc.nextLine();
		Boolean first = NRC.contains("(N)");
		Boolean second = NRC.contains("(naing)");
		
		if(first == true) {
			String[] splits = NRC.split("/");
	            for (int i=1; i < splits.length; i++){
	                System.out.println(splits[0]);
	              }
	            String[] splits2 = NRC.split("(N)");
	            for (int i=1; i < splits2.length; i++){
	                System.out.println(splits2[1]);
	              }
//			var substr = NRC.subSequence(0, '/');
//			var no = NRC.subSequence(')',' ');

//			System.out.println("TownShip: " + splitted);
//			System.out.println("Number: " + no);
		}else {
			var substr = NRC.substring(3,10);
			var no = NRC.substring(17,23);
			
			System.out.println("TownShip: " + substr);
			System.out.println("Number: " + no);
		}
		
	}
}
