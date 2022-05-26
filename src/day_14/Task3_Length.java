package day_14;
import java.util.Scanner;
public class Task3_Length {
public static void main(String[] args) {
//write a program that asks user to enter two strings, 
	//and print out the longest string
	
	
	Scanner scan = new Scanner(System.in);
    
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    
    if(str1.length() > str2.length()) {
        System.out.println(str1);
    }else {
        System.out.println(str2);
    }

scan.close();

	
}
}
