package day11_3rdReview;
import java.util.Scanner;

public class Task_3AreYouAuthorize {
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your full name:");
		String name = scan.nextLine();
		
		System.out.println("What is your clearance level? ");
		int clearLevel = scan.nextInt();
		String role = "";
		
		
		
		if(clearLevel == 4) {
			role = "admin";	
		}else if (clearLevel == 3) {
			role = "manager";
		}else if(clearLevel == 2) {
			role = "senior employee";
		}else if(clearLevel == 1) {
			role = "junior employee";
		}
		
		if (clearLevel >= 3) {
			System.out.println(name + ", you are " + role + ". Welcome to the program ABC.");
		}else {
			System.out.println("Sorry, " + name + ". The " + role + " don't have access to this program.");
		}
		
		scan.close();
		
		
		

	}

}



			