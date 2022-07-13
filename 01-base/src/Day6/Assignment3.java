package Day6;
import java.util.Scanner;

public class Assignment3 {
		
	public static void main(String[] args) {
		
		System.out.print("Enter your NRC No.: ");
		Scanner sc = new Scanner(System.in);
		String NRC = sc.nextLine();
		Boolean first = NRC.contains("(N)");
		Boolean second = NRC.contains("(naing)");
		
		for (int i = 0; i < NRC.length(); i++){
            if (NRC.charAt(i) == '/'){
            	for(int j = 0; j < NRC.length(); j++) {
                	if (NRC.charAt(j) == '('){
                        String township = NRC.substring(i+1, j);
                        System.out.println("Township : "+ township);
                        break;
                   }
                }
            }           
        }
		for (int i = 0; i < NRC.length(); i++) {
			if (NRC.charAt(i) == ')'){
                String number = NRC.substring(i+1);
                System.out.println("Number : "+number);
                break;
           }
		}
		
	}
}
