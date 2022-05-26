package day_14;
import java.util.Scanner;
public class Task_8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
//	write a program that asks the user enter a three letter word. Check if the middle
//	character of the given word is 'a'. In the case it is print: "Cool word", but in the case
//	the middle letter is not 'a' print: "Okay word".
//	     - If the user does not enter a 3 letter word tell them:
//	             If the word is less than 3 letters: "Word is too short"
//	             If the word is too long: "Word is too long"
//}
	
	System.out.println("Please enter the three word");
	
	String word = sc.nextLine();

	
	String strA ="";
	String strB = "3"; 
	
	if(word.charAt( 1) =='a'){
		System.out.println("Cool word");
		
	}else if(word.charAt(1) !='a') {
		System.out.println("Okey word");
		
System.out.println("Please enter a Three Letters Word");
		
System.out.println("Please enter a Three Letters Word");

//String str = sc.nextLine();
	     if(word.length()>3) {
			System.out.println("Word is too long!");
			   }else if (word.length() < 3) {
			      System.out.println("Word is too short");
		     }else {

      			      
     			   }
     			   }
     			   sc.close();
	}
}
       		     

	 
		
		

	
	



