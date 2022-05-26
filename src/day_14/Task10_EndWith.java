package day_14;
import java.util.Scanner;
public class Task10_EndWith {
	public static void main(String[] args) {
		
//ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
//		`
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the world");
		
        String word = sc.next();
		
		if(word.endsWith("ly")) {
			System.out.println("Really???");
			
		}else {
			System.out.println("Never mind");
		}
		
		sc.close();

		
		
	}

}
