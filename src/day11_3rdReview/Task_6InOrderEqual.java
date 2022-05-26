package day11_3rdReview;

import java.util.Scanner;

public class Task_6InOrderEqual {
	
	public static void main(String[] args) {
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		boolean isEqualOk = false;
		
		if(a == b && a == c && isEqualOk) {
			System.out.println(true);
			
		}else if(a == b && a < c && isEqualOk) {
			System.out.println(true);
			
		}else if(a < b && b == c && isEqualOk) {
			System.out.println(true);
			
		}else if(a < b && b < c && isEqualOk) {
			System.out.println(true);
			
		}else if(a < b && b < c && !isEqualOk) {
			System.out.println(false);
		}else {
			System.out.println(false);
		}
		
		scan.close();


	}

}


	