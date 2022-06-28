package Day3;

import java.util.Scanner;

public class ReadData_Scanner {

	public static void main(String[] args) {
		//Open
		Scanner sc = new Scanner(System.in);
		
		//process
		System.out.print("Enter name :");
		String name = sc.nextLine();
		System.out.print("nter salary :");
		
		//double salary = sc.nextDouble();
		double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter age :");
		int age = sc.nextInt();
		
		//close
		sc.close();
		System.out.println("\n------ Your Data ------\n");
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);
		System.out.println("Age :" + age);
		
	}
}
