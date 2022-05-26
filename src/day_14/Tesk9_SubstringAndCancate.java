package day_14;
import java.util.Scanner;

public class Tesk9_SubstringAndCancate {
public static void main(String[] args) {
//	Ask user to enter two words. Print first word without its first character
//    then print the second word without its first character.
//            Input:
//                apple
//                banana
//            Output:
//                ppleanana
	Scanner sc = new Scanner(System.in);
	String word1 = sc.nextLine();// Hello
	String word2 = sc.nextLine();// World
	
	String wordOutput1 = word1.substring(1);
	String wordOutput2 = word2.substring(1);
	
	System.out.println(wordOutput1.concat(wordOutput2)); //elloorld
	
	sc.close();

	
	
	
}
}
