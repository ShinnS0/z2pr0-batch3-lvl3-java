package Day6;

public class Exception_demo {

		public static void main(String[] args) {
			display(100);
		}
		
		private static void display(int i) {
			System.out.println("Number is " + i);
			display(300);
		}
}
