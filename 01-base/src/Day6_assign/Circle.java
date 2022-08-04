package Day6_assign;

import java.util.Scanner;

public class Circle implements shape_1{
	
	int radius; // radius
	Scanner sc = new Scanner(System.in);
	
	@Override
	public double Area() {
		System.out.print("Enter radius: ");
		int radius = sc.nextInt();
		
		double area = 3.142 * radius * radius;
		System.out.println("The calculated area of the circle: " + area);
		return area;
	}

	@Override
	public double Volume() {
		return 0;
	}

}


