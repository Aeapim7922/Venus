package whileloop.practice;
 import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		

		
			
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to the grade book for");
				System.out.println("Share.OlanLab.Com Course - Java Programming!");
				
				int total;
				int gradeCounter;
				int grade;
				int average;

				total = 0;
				gradeCounter = 3;

				while (gradeCounter <= 10) {
					System.out.print("Enter grade: ");
					grade = input.nextInt();
					total = total + grade;
					gradeCounter = gradeCounter + 2;
							
					;
							
				}

				average = total / 3;

				System.out.printf("\nTotal of all 10 grades is %d", total);
				System.out.printf("\nClass average is %d", average);
				//%d is average value

			}
		

	}


