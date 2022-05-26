package day_14;
import java.util.Scanner; 

public class Task2Reverse {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    
//	Create a class called Reverse, write a program that will reverse a string.
//    Your program should reverse a string only 5 characters long.
//    If word is shorter, display message: "Too short!".
//    If word is longer, display message: "Too long!".
//    Otherwise, reverse this word and print out result into the console.
//	
//}
	
	
    
//    System.out.println("Please enter a word of 5 characters long:");
//    
//    String word = scan.next();
//
//    
//    if(word.length() > 5) {
//        System.out.println("Too long!");
//    }else if(word.length() < 6) {
//        System.out.println("Too short!");
//    }
//    
    //scan.close();
	        
//////////////////////////////////////////////
    
    String str = "Pizzaa";
    if(str.length()==5) {
    	//reverse your string
    	
    	for (int i = 4; i>=0; i--) {
    		System.out.println(str.charAt(i));
    	}
    	
    }else if (str.length() > 5)	{
    	System.out.println("Too long");
    }else {
    	System.out.println("Too short");
    }
	        
	    }

	}

