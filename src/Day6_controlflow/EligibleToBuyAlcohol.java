package Day6_controlflow;
import java.util.Scanner;
public class EligibleToBuyAlcohol {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name= sc.nextLine();
        
        System.out.println("Please enter your age");
        int age = sc.nextInt();    
        age = 0;
        
        if (age>21) {
            System.out.println("Your are eligible to drink");
        }    
        if (age<21) {
            System.out.println("You are too young to drink");
        }
       else {
            System.out.println("Please enter valid age");
        }

        sc.close();
//=========================        
//        String name= "james";
//        int age = 19;
//        String message = name+ "is eligible to buy alcohol?";
//        boolean isEligible= age>=21;
//        
//        System.out.println(message);
//        System.out.println(mess)
                
        
}
}