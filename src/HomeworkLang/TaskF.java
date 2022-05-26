package HomeworkLang;
import java.util.Scanner;
public class TaskF {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
        float i = 00;
        
		System.out.println("Please enter the letter");
		char letter = sc.next().charAt(00);
		
		if (letter>='A' && letter <+'Z'){
			System.out.println(letter + " is a uppercase alphabet");
			
		}else if(letter>='a' && letter <+'z') {
			System.out.println(letter + " is a lowercase alphabet");
			
		}else  if(i>=00 &&  i<=99) {
			System.out.println(letter + " is a number");
			
		}else {
			System.out.println(" this input cannot be computed");
		}
				
		sc.close();
	}
}
