package Day7;

public class exception_assign1 {

	public static void main(String[] args) {

		try {
			String[] numbers = {"10","56","1","150","9"};
			int total=0;
			int count=0;
			
			//show string
			for(var c=0;c<5;c++) {
				int num = Integer.parseInt(numbers[c]);
				System.out.print(num + "\t");
				total += num;
				count++; 
//				System.out.println(total + "," + count);
			}
			//average
			float avg = total/count;
			System.out.println("\nAverage : " + avg); 
			
			int[] values = new int[numbers.length];
			for(var i=0;i<numbers.length;i++) {
				values[i] = Integer.parseInt(numbers[i]);
			}
//			System.out.println(Arrays.toString(values));
			
			int min = values[0];
			int max = values[0];
			
			for(var p=0;p<5;p++) {
				if(values[p] < min) min = values[p];
				if(values[p] > max) max = values[p];
			}
				System.out.println("Min : " + min);
				System.out.println("Max : " + max);
					
		}
		catch(NumberFormatException obj){
			System.err.println("Input is not a number");
		}
		catch(ArithmeticException obj) {
			System.err.println("Divisor must not be zero");
		}
		catch(ArrayIndexOutOfBoundsException obj){
			System.err.println(obj.getMessage());
		}
		System.out.println("Outside try catch block!");
	}
}
