package Day4;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment2 {

	public static void main(String[] args) throws ParseException {
			
			Scanner sc = new Scanner(System.in);
			String ans;
			
			do {
				System.out.print("Do you want to exit? write 'exit' : ");
				ans = sc.nextLine();
				
				if(ans.equalsIgnoreCase("exit")) {
					System.out.println("End Program.......\n");
				}else {
					
					System.out.print("When do you go bed ?(hh:mm:ss am/pm): ");
					String time = sc.nextLine();
					
					System.out.print("When do you get up? (hh:mm:ss am/pm): ");
					String time2 = sc.nextLine();
					
					DateFormat sd = new SimpleDateFormat("hh:mm:ss aa");
					Date Bedtime = sd.parse(time);
					Date Getup = sd.parse(time2);
					
					System.out.println("Go bed : " + sd.format(Bedtime));
					System.out.println("Get up : " + sd.format(Getup));
					
						long start = Bedtime.getTime();
					    long end = Getup.getTime();
					     
						 if(Bedtime.getTime()> 43200000) {
							  start = Bedtime.getTime() - 43200000;
						 }
						 else {
							 start = Bedtime.getTime() + 43200000;
						 }
						 
						 if(Getup.getTime()> 43200000) {
							  end = Getup.getTime() - 43200000;
						 }
						 else {
							  end = Getup.getTime() + 43200000;
						 }
						 
						 long diffMs = end- start;
					    
		
					     long hour = (diffMs/ (3600*1000))%24; 
					     
					     long min = (diffMs / (60 * 1000)) % 60;
					     long second = (diffMs /1000 )% 60;
		
					     System.out.println("Sleep time hours is " + hour + "hours " +min + " minutes and "+ second +"seconds.");
					     
					     if(hour >= 5 && hour <= 8) {
					    	 System.out.println("You take care your health well!");
					     } 	 
					     if(hour < 5){
					    	 System.out.println("You are very hardworking!");
					     }
					     if(hour > 8){
					    	 System.out.println("You are abnormal!");
					     }
				}	
				
			}while(ans != "exit");
		}
		
}
