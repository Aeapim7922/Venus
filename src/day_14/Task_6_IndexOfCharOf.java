package day_14;

public class Task_6_IndexOfCharOf {
public static void main(String[] args) {
	
//	## Task6
//	`
//	write a program that can return the initials of the user
//
//	            ex:
//	                techcircle school
//	                   output:                                                                 
//	                T.S
//
//	        Note: Pay attention to the example output
//	`
	String name = "TechCiecle School";
	 System.out.println(name.charAt(4));
	 
	 System.out.println(name.charAt(11));
	 
	 System.out.println(name.indexOf('c', 9));
}

}
