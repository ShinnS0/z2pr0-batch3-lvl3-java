package Day1.copy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class test {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		LocalDate date = LocalDate.now();
		LocalTime times = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		String [] menu = {"Pizza","Burger", "Milk Tea","Spicy Noodle"};
		String [] township = {"AA","BB","CC","DD"};
		String [] orderType = {"Order Now","Preorder "};
		int [] time = {15,30,10,45};
		
		System.out.println("\t______________ Available Menu ______________");
		for(int i = 0; i<menu.length;i++) {	
			System.out.println(i+1 +". "+ menu[i]);
		}
		System.out.println("Please choose item : ");
		int menuInput = sc.nextInt();
		
		System.out.println("\t______________ Deliverable Townships ______________)");
		for(int i = 0; i<township.length;i++) {	
			System.out.println(i+1 +". "+ township[i] +"(" +time[i]+" mins )");
		}
		System.out.println("Please choose township : ");
		int tspInput = sc.nextInt();
		
		System.out.println("\t______________ Order Type ______________");
		for(int i = 0; i<orderType.length;i++) {	
			System.out.println(i+1 +". "+ orderType[i]);
		}
		System.out.println("Please choose 1 or 2 : ");
		int orderTypeInput = sc.nextInt();
				
		if((menuInput >= menu.length && 
			tspInput >=  township.length && 
			orderTypeInput >=  orderType.length) ||
			(menuInput <= 0 &&tspInput <= 0 && orderTypeInput <= 0 )){
			
				System.out.println("Menu does not exit !");	
				
			}else{
				
				if(orderTypeInput==1) {					
					 SimpleDateFormat df = new SimpleDateFormat("HH:mm aa");
					 Calendar cal = Calendar.getInstance();
					 cal.add(Calendar.MINUTE, time[tspInput-1]);
					 String arrTime = df.format(cal.getTime());
					 	System.out.println("\t______________ Ordrer Information ______________ ");
						System.out.println("1. Item : "+ menu[menuInput-1]);
						System.out.println("2. Address : "+ township[tspInput-1]);
						System.out.println("3. Order Type : "+ orderType[orderTypeInput-1]);
						System.out.println("Arrival Time : "+ arrTime);
				}else {
					System.out.println("Enter Delivery Date (dd): ");
					int PreDateInput = sc.nextInt();
					Calendar calendar = Calendar.getInstance();
					
						if(PreDateInput <= calendar.get(Calendar.DAY_OF_MONTH)|| PreDateInput > 31) {
							System.out.println("Your date is impossible. Please enter delivery date(dd) again !");							
						}else {
							DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							String formatDate = date.format(currentDate).toString();
							String concatDay = formatDate.substring(2,formatDate.length());
							
							System.out.println("\t______________ Ordrer Information ______________");
							System.out.println("1. Item : "+ menu[menuInput-1]);
							System.out.println("2. Address : "+ township[tspInput-1]);
							System.out.println("3. Order Type : "+ orderType[orderTypeInput-1]);
							System.out.println("Arrival Date: "+PreDateInput + concatDay);
						}										
				}				
		}		
	}
}

