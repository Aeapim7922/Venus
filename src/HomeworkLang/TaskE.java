package HomeworkLang;
import java.util.Scanner;

public class TaskE {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your 1st number");
	int a = sc.nextInt();
	System.out.println("Please enter your 2nd number");
	int b = sc.nextInt();
	System.out.println("Please enter your 3rd number");
	int c = sc.nextInt();
	System.out.println("Please enter your 4th number");
	int d = sc.nextInt();
	if(a+ b == c+d) {
		System.out.println("Yay!!" +  (a+ +b+ c+ +d) + " is your lucky number ");
	}else {
		
		System.out.println("Nah!!" +( a+ b+ +c+ +d) +" is not your lucky number ");
	}
	
	sc.close();
}


	
	
	
}

