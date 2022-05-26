package day_14;
import java.util.Scanner;
public class Task_7_EmptyString {
public static void main(String[] args) {
//	Write a method that asks user to enter a string.
//    if the string is empty, print: string is empty
//    if the string has more than 3 characters, print the last three characters
//    if the string has less than or equal 3 characters, print the string itself
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a String");
	String name = sc.next();
	
	String report ="";
	
	if(report.length()==0) {
		System.out.println("String is empty");
		
	}else if(name.length()>3) {
		System.out.println("The last three characters");
		
	}else if(name.length()<=3 ) {
		System.out.println("The string itself");
		
	}else {
		System.out.println("Cant count the characters");}
		
	
	
		 
	}
}


