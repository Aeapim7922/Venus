package HomeworkLang;
import java.util.Scanner;


public class SolutionA {
	public static void main(String[] args) {
		 
		
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Please enter 3 number");
//				int num1= sc.nextInt();
//				int num2 = sc.nextInt();
//				int num3 = sc.nextInt();
//				
//				if (num1> num2 && num1> num3 && num2>num3 ) {
//					System.out.println(num1 + " " + num2 + " "+num3);
//					System.out.println("\nTrue");
//					
//					
//			}else {
//				System.out.print(num1+" "+num2+" "+num3);
//				System.out.println("\nFalse");
//				}
//			
//		       sc.close();
//		}
//////////////////////////////////////////////////////////////
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Plesae enter 3 number");
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();
	 int num3 = sc.nextInt();
	 
	 if (num1> num2 && num1> num3 && num2> num3) {
		 System.out.println(num1 + " " + num2+ " "+ num3);
		 System.out.println("\nTrue");
		 
	 }else {
		 System.out.println(num1 + " "+ num2+ " "+num3);
		 System.out.println("\nFalse");
	 }
	 
	}
////////////////////////////////////////////////////////////////



		
	}


