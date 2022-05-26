package Day5_operator;

import java.util.Scanner;

public class ScannerPractice {
public static void main(String[] args) {
	
	Scanner irfan = new Scanner(System.in);
	
	System.out.println("Plase type value a");
	//int a = 1;
	String a = irfan.nextLine();
	
	System.out.println("Plase type value b");
	//int b = 2;
	String b =irfan.nextLine();
	
	System.out.println("Plase type value c");
	//int c = 3;
	String c = irfan.nextLine();
	
	System.out.println(a +" " + b +" "+ c); 
	
	irfan.close();
	
}
}
