package Day1.copy;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String args[]) throws ParseException{
		
		Scanner input = new Scanner(System.in);
		 System.out.print("When do you go bed ?(hh:mm:ss am/pm): ");
		 String time = input.nextLine();
		 System.out.println();
		 System.out.print("When do you get up? (hh:mm:ss am/pm): ");
		 String time2 = input.nextLine();
		 System.out.println();
		 DateFormat sdf = new SimpleDateFormat("HH:mm:ss aa");
		 Date goBed = sdf.parse(time);
		 Date getUp = sdf.parse(time2);

		 System.out.println("Go bed : " + sdf.format(goBed));
		 System.out.println("Get up : " + sdf.format(getUp));
		 

		     long start = goBed.getTime();
		     long end = getUp.getTime();
		     
			 if(goBed.getTime()> 43200000) {
				  start = goBed.getTime() - 43200000;
			 }
			 else {
				 start = goBed.getTime() + 43200000;
			 }
			 
			 if(getUp.getTime()> 43200000) {
				  end = getUp.getTime() - 43200000;
			 }
			 else {
				  end = getUp.getTime() + 43200000;
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
}
