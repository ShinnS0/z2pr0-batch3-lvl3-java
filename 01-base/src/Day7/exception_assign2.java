package Day7;
	import java.util.Scanner;

public class exception_assign2 {

	public static void main(String[] args) {
			
			String[]division = {"Kachin","Kayar","Kayin","Chin","Sagaing","Tanintharyi","Bago","Magway","Mandalay","Mon","Rakhine","Yangon","Shan","Ayeyawady",};
			String state = null;
			
			try{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter Your NRC State No : "); // 12/
				String s1 = sc.nextLine();
				String u1 = s1.substring(0, 3);
				switch(s1) {
				case "1/":
					state = "Kachin";
					break;
				case "2/":
					state = "Kayar";
					break;
				case "3/":
					state = "Kayin";
					break;
				case "4/":
					state = "Chin";
					break;
				case "5/":
					state = "Sagaing";
					break;
				case "6/":
					state = "Tanintharyi";
					break;
				case "7/":
					state = "Bago";
					break;
				case "8/":
					state = "Magway";
					break;
				case "9/":
					state = "Mandalay";
					break;
				case "10/":
					state = "Mon";
					break;
				case "11/":
					state = "Rakhine";
					break;
				case "12/":
					state = "Yangon";
					break;
				case "13/":
					state = "Shan";
					break;
				case "14/":
					state = "Ayeyawady";
					break;
				default:
					state = "Unknown";
				}
				if(state.equals("Unknown")) {
					System.err.println("The input NRC state No is Invalid");
				}else {
				
				System.out.print("Enter Your NRC Township : ");
				String s2 = sc.nextLine();
				System.out.print("Enter Your NRC Citizens or not : ");
				String s3 = sc.nextLine();
				System.out.print("Enter Your NRC No : ");
				String s4 = sc.nextLine();
				
				// NRC
				System.out.println("Your NRCNO :" + s1 + s2 + s3 + s4);
				
				//State
				System.out.println("Division/State : " + state);
				
				// Township
				System.out.println("Township : " + s2);
				
				// NRC No
				System.out.println("Number : " + s4);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.print("The input NRC data is Invalid");
			}
			
		}
}
