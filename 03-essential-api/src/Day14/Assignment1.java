package Day14;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;


	public class Assignment1 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String[] student = {"Maung Maung","Hla Hla","Aye Aye","Chan Aye","Kaung Kaung"};
			ArrayList<String> list = new ArrayList<>(Arrays.asList(student));
			
			// show
			System.out.println(list);
			
			// sort & show
			Collections.sort(list);
			System.out.println(list);
			
			// search & position
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Search a student: ");
			String search = sc1.nextLine();
			int index = Collections.binarySearch(list, search);
			System.out.println(index < 0 ? "Not Found" : "Found" + "\tpostition : " + (index + 1));
			
			// add
			System.out.print("Enter student name to add: ");
			String input = sc.nextLine();
			if(list.contains(input)) {
				System.out.println("This name is already in the list");
			}else {
				list.add(input);
				System.out.println(list);
			}
			
			// show start with "K" or "k"
//			var k = list.removeIf(name -> name.endsWith("G") | name.endsWith("g"));
//			System.out.println();
			for(var i=0;i<5;i++) {
				if(student[i].startsWith("K") || student[i].startsWith("k")) {
					System.out.println("Start with 'K or k' : " +  student[i]);
				}
			}
			
			// remove "G" or "g"
			list.removeIf(name -> name.endsWith("G") | name.endsWith("g"));
			System.out.println("After remove name end with 'g': " + list);
			
			// clear list
			list.clear();
			System.out.println("After clear list: " + list);
		}
	}

