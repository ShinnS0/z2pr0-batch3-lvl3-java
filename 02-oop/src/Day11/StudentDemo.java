package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo extends StudentAssign{

	public static void main(String[] args) {
			
try(Scanner sc = new Scanner(System.in)) {
			
			//Fields
			int total = 0;
			int count = 0;
			int max = 0;
			int maxId = 0;
			String Na = "";
			
			StudentAssign stu[] = new StudentAssign[4];
			
			ArrayList<StudentAssign> stuList = new ArrayList<>();

			for(var i=0;i<4;i++) {
				stu[i] = new StudentAssign();
				System.out.println("Enter Student " + (i+1) + " information");
				System.out.print("Enter Student ID : ");
				int id = sc.nextInt();
				System.out.print("Enter Student's name : ");
				String name = sc.next();
				System.out.print("Enter Student's mark : ");
				int mark = sc.nextInt();
				stu[i].initData(id, name, mark);;
			}
			System.out.println();
			System.out.println("ID" + "\tName" + "\tMark");
			for(var i=0;i<4;i++) {
				stu[i].showInfo();
			}
			System.out.println();
			
			System.out.print("Search a Student by ID : ");
			int find = sc.nextInt();
			for(var i=0;i<4;i++) {
				if(find == stu[i].getId()) {
					System.out.println("ID : " + stu[i].getId() + "\tName : " + stu[i].getName() + "\tMark : " + stu[i].getMark());
				}
			}
			System.out.println();
			
			for(var i=0;i<4;i++) {
				stuList.add(stu[i]);
				for(var x=0;x<stuList.size();x++) {
					if(stuList.get(i).getMark() > max) {
						max = stuList.get(i).getMark();
						Na = stuList.get(i).getName();
						maxId = stuList.get(i).getId();
					}
				}
			}
			System.out.println("This student has the Maximum mark : ");
			System.out.println("ID : " + maxId + "\nName : " + Na + "\nMark : " + max);
			System.out.println("---------------------");
			
			for(var i=0;i<4;i++) {
				total += stu[i].getMark();
				count++;
			}
			System.out.println("Total Mark : " + total);
			System.out.println("Average Marks : " + (float)total/count);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
				
		}
}


