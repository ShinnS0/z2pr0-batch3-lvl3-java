package Day4;
import java.util.Scanner;

public class Assignment2 {

		public static void main(String[] args) {
			int wake,sleep;
			
			System.out.print("Enter the time that u go to bed: ");
			Scanner data_s = new Scanner(System.in);
			sleep = data_s.nextInt(); 
			
			System.out.print("Wake time: ");
			Scanner data_w = new Scanner(System.in);
			wake = data_w.nextInt();
			
			var final_data = sleep + wake ;
			
			
//			System.out.println(final_data);
		}
		
}
