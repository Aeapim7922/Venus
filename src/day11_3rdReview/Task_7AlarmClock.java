package day11_3rdReview;

public class Task_7AlarmClock {
public static void main(String[] args) {
	
	boolean isVacation = false;
	int day = 4;
	String weekDay = "";
	
	 			
	     switch (day) {
	     case 0:
	    	    weekDay = "Sunday";	 
	            break;
	     case 1:
				weekDay = "Monday";
				break;
	     case 2:
				weekDay = "Tuesday";
				break;
	     case 3:
				weekDay = "Wednesday";
				break;
	     case 4:
				weekDay = "Thursday";
				break;
	     case 5:
				weekDay = "Friday";	
				break;
	     case 6:
	    	    weekDay = "Saturday";
	    	    break;  
	            default:
	        	 System.out.println("Invalid input");
	     }
	     
	     
	     if (isVacation) {
	    	 if(day >= 1 && day <= 5) {
	     System.out.println(day + " = " + weekDay + " Alarm is at 10:00");
	     
	     
	         }else if(day == 6 || day == 0) { 
			System.out.println(day + " = " + weekDay + " Alarm is off");
	         }
			 	    	 
	     }else if(!isVacation) {
	    	 if (day >= 1 && day <= 5) {
	    		 System.out.println(day + " = " + weekDay + " Alarm is at 07:00");
	    		 
	         }else if(day == 6 || day == 0) {
	    		 System.out.println(day + " = " + weekDay + " Alarm is at 10:00");
	         }
	    		 
	     } 
			
	

}


}

