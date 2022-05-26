package day11_3rdReview;
import java.util.Scanner;
public class Task_4CoffeeMachine {
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter how many cups of coffee you will need:");
		
		int cups = scan.nextInt();
		
		int waterMl = cups * 200;
		int milkMl = cups * 50;
		int coffeeG = cups * 15;
		
		System.out.println("For " + cups + " cups of coffee you will need: ");
		System.out.println("- " + waterMl + " ml of water");
		System.out.println("- " + milkMl + " ml of milk");
		System.out.println("- " + coffeeG + " g of coffee beans");
		
		scan.close();
			
		

	}





	}


