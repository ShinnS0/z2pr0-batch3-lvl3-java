package Day6_assign;

public class Person_Demo {

		public static void main(String[] args) {
			
			try {
				Teacher u1 = new Teacher("MgMg", "12/batahta(n)043519", "Yangon", "09123456789", "Tutor", "Geology", 200000);
				Teacher u2 = new Teacher("Cheery", "12/asana(n)126562", "Sagaing", "09353454653", "Guide", "Math", 150000);
				
//				u1.showInfo();
//				System.out.println();
//				u1.showIdInfo();
				
				u1.forward();
				System.out.println("--------------------------------------------------");
//				u2.forward();
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
