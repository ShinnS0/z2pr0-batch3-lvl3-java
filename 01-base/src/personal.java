import java.util.Scanner;
public class personal {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Scanner data = new Scanner(System.in);
		int days = data.nextInt();
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		
		System.out.println(days + " days" + " = " + seconds + " seconds.");
	}
}
