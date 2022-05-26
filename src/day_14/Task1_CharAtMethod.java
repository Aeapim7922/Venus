package day_14;

public class Task1_CharAtMethod {
public static void main(String[] args) {
//	## Task1
//	`write a program that asks user to enter a sentence.
//	                then print the first & last characters of the sentence
//	Example:
//	    Input: Welcome To TechCircle
//	    output: We
	
	String input = "Welcome To Techcircle!";
	System.out.println(input.charAt(0));
	System.out.println(input.charAt(8));
	
	char firstChar = input.charAt(0);
	//char lastChar = input.charAt(21);
	char lastChar = input.charAt(input.length()-1);
	
	System.out.println(firstChar);
	System.out.println(lastChar);

	System.out.println(input.charAt(22-1));
	
	String result = ""+firstChar;
	System.out.println(result);
	result += lastChar;
    System.out.println(result);
	
}
}
