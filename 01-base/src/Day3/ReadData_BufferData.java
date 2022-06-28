package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData_BufferData {
	
	public static void main(String[] args) throws IOException {
		//Create object
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Operations
		System.out.print("Enter name :");
		String name = reader.readLine();
		System.out.print("Enter salary :");
		int salary = Integer.parseInt(reader.readLine());
		System.out.print("Enter bonus rate :");
		float bonus = Float.parseFloat(reader.readLine());
		
		//close object
		reader.close();
		
		System.out.println("\n------- Your data -------");
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);
		System.out.println("Bonus rate :" + bonus);
		
	}
}
