package day_14;
import java.util.Scanner;
public class Task11_StartWith {
public static void main(String[] args) {
	 
//Ask user to enter a word. If the work starts with x, print the word without x.
//    Input:
//        xcode
//    Output:
//        code
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the word");
	
	String word = sc.nextLine();
	
	
		
		sc.close();
	
		if(word.startsWith("x")) {
			System.out.println(word.substring(1));
			
		}else {
			System.out.println(word);
		}
		
		sc.close();
		

	
	
}
	
}



