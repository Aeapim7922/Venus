package HomeworkLang;

import java.util.Scanner;

public class SolutionC {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		
		int num1 = sc.nextInt();
		
		if (num1 >=-10 && num1 <=10) {
		  System.out.println(num1+" is true");
		  
		}else {	
				System.out.println(num1+ " is false");
				
			}if(num1  <=10 && num1 >=10) {
				System.out.println(num1+" is true");
				
			//}else {
				//System.out.println(num1" is invalid number");
			}
		sc.close();
	}
	}


		



