package day_14;
import java.util.Scanner;
public class Task14_SubStringUpperLowerCase {
	public static void main(String[] args) {
	
//	Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
//    input:
//        firstName = "tecHCIrcle"
//        lastName = "SCHOOL";
//    output:
//        Techcircle School
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plase enter first name");
		System.out.println("Please ente last name");
		
		String firstname = sc.nextLine();//pim
		String lastname  = sc.nextLine();//nawa
		
		String firstN = firstname.substring(0, 1).toUpperCase();//P
		String firstNameOut = firstname.substring(1).toLowerCase(); //im
		
		String lastN = lastname.substring(0, 1).toUpperCase(); //N
		String lastNameOut = lastname.substring(1).toLowerCase(); //awa
		
System.out.println("Report: " + firstN + firstNameOut + " " + lastN + lastNameOut);
		
		
		sc.close();

		
		
		
		
		
		
		
		
//}
}
}