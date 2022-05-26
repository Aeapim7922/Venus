package HomeworkLang;
import java.util.Scanner;

public class TaskG{

	public static void main(String[] args) {
		
		  // given integer 'n'
	      int n = 44;

	      if (n % 2 != 0) { // if n is odd
	         System.out.println("Weird");
	      } else { // if n is even
	         if (n >= 2 && n <= 5)  // inclusive range of 2 to 5
	            System.out.println("Not Weird");
	         else if (n <= 20)  // inclusive range of 6 to 20
	            System.out.println("Weird");
	         else  // greater than 20
	            System.out.println("Not Weird");
	      }
	      
	      // 20
	      // 2 3 4 5                 true      false
//	      if (n >= 2 && n <= 5) // n <= 5 != n >= 6 // opposite
//	      // 6 7 ... 20
//	      else if (n <= 20)
//	      // 21 22 ... 100
//	      else // greater 20

	

}
}
	

		
