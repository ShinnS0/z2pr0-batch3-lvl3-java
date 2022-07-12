package Day8;

public class Block_test {

		static int min_length;
		String phone;
		
		public Block_test(String input) {
			System.out.println("This is arg constructor");
			this.phone = phone;
		}
		
		public Block_test(){
			System.out.println("This is static constructor");
			
		}
		
		{//instance block
			System.out.println("This is instance block");
			phone = "Invalid number";
		}
		
		static {
			System.out.println("This is static block");
			min_length = 11;
		}
		
		public static void main(String[] args) {
			Block_test obj1 = new Block_test("09795283480");//initialize
			
			System.out.println("Object1's number: " + obj1.phone);
			
			System.out.println("----------");
			
			Block_test obj2 = new Block_test("");//no initialize
			System.out.println("Object2's number: " + obj2.phone);
			
		}
}
