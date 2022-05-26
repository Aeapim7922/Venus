package day11_3rdReview;
import java.util.Scanner;
public class Task_1WarmUp {
public static void main(String[] args) {
	

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number < 100: ");
			int n = scan.nextInt();
			String word = "";
			
			
				if (n >= 20 && n <= 29) {			 	
						  word = "twenty ";
						  
				    }else if(n >= 30 && n <= 39) {
				    	 word = "thirty ";
				    	 
				    }else if(n >= 40 && n <= 49) {
				    	 word = "fourty ";
				    	 
				    }else if(n >= 50 && n <= 59) {
				    	 word = "fifty ";	 
				    	 
				    }else if(n >= 60 && n <= 69) {
				    	 word = "sixty ";
				    	  	 
				    }else if(n >= 70 && n <= 79) {
				    	 word = "seventy ";
				    	 			    	 
				    }else if(n >= 80 && n <= 89) {
				    	 word = "eighty ";
				    	 
				    }else if(n >= 90 && n <= 99) {
				    	 word = "ninety ";
				    }
				    	 
				    	 
				    	 if(n % 10 == 1) {
				    		 word += "one";
				    		 
				    	 }else if(n % 10 == 2) {
				    		 word += "two";
				    		 
				    	 }else if(n % 10 == 3) {
				    		 word += "three";
				    		 
				    	 }else if(n % 10 == 4) {
				    		 word += "four";
				    		 
				    	 }else if(n % 10 == 5) {
				    		 word += "five";
				    		 
				    	 }else if(n % 10 == 6) {
				    		 word += "six";
				    		 
				    	 }else if(n % 10 == 7) {
				    		 word += "seven";
				    		 
				    	 }else if(n % 10 == 8) {
				    		 word += "eight";
				    		 
				    	 }else if(n % 10 == 9) {
				    		 word += "nine";
				    	 }
				    	 
				    	 if(n == 11) {
				    		 word = "eleven";
				    	 }else if(n == 12) {
				    		 word = "twelve";
				    	 }else if(n == 13) {
				    		 word = "thirteen";
				    	 }else if(n == 14) {
				    		 word = "fourteen";
				    	 }else if(n == 15) {
				    		 word = "fifteen";
				    	 }else if(n == 16) {
				    		 word = "sixteen";
				    	 }else if(n == 17) {
				    		 word = "seventeen";
				    	 }else if(n == 18) {
				    		 word = "eighteen";
				    	 }else if(n == 19) {
				    		 word = "nineteen";
				    	 } 
				    	 
		
						System.out.println(word);
						
						scan.close();	
				 

	
}
}
