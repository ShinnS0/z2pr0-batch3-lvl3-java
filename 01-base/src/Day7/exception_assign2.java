package Day7;
	import java.util.Scanner;

public class exception_assign2 {

	public static void main(String[] args) {
			
			String[]division = {"Kachin","Kayar","Kayin","Chin","Sagaing","Tanintharyi","Bago","Magway","Mandalay","Mon","Rakhine","Yangon","Shan","Ayeyawady",};
			String state = null;
			String s1;
			try{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter Your NRC State No : "); // 12/
				String NRC = sc.nextLine();
				
				for (int i = 0; i < NRC.length(); i++){
		            if (NRC.charAt(i) == '/'){
		            	s1 = NRC.substring(0, i);
		            	System.out.println(s1);
		            
		            switch(s1) {
					case "1":
						state = "Kachin";
						break;
					case "2":
						state = "Kayar";
						break;
					case "3":
						state = "Kayin";
						break;
					case "4":
						state = "Chin";
						break;
					case "5":
						state = "Sagaing";
						break;
					case "6":
						state = "Tanintharyi";
						break;
					case "7":
						state = "Bago";
						break;
					case "8":
						state = "Magway";
						break;
					case "9":
						state = "Mandalay";
						break;
					case "10":
						state = "Mon";
						break;
					case "11":
						state = "Rakhine";
						break;
					case "12":
						state = "Yangon";
						break;
					case "13":
						state = "Shan";
						break;
					case "14":
						state = "Ayeyawady";
						break;
					default:
						state = "Unknown";
					}
					if(state.equals("Unknown")) {
						System.err.println("The input NRC state No is Invalid");
					}else {
						// NRC
						System.out.println("Your NRCNO :" + NRC);
						
						//State
						System.out.println("Division/State : " + state);
						
						for (int x = 0; x < NRC.length(); x++){
				            if (NRC.charAt(x) == '/'){
				            	for(int j = 0; j < NRC.length(); j++) {
				                	if (NRC.charAt(j) == '('){
				                        String township = NRC.substring(i+1, j);
				                        System.out.println("Township : "+ township);
				                        break;
				                   }
				                }
				            	for (int p = 0; p < NRC.length(); p++) {
									if (NRC.charAt(p) == ')'){
						                String number = NRC.substring(p+1);
						                System.out.println("Number : "+number);
						                break;
									}
				            	}          
				            	 
				            }
						
						}
					
					}
				}
			}
		}	
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.print("The input NRC data is Invalid");
		}	
	}
}


	
				
				
			
		

