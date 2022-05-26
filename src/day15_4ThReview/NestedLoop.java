package day15_4ThReview;
import java.util.Scanner;
public class NestedLoop {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    // while
    // do while
    // for
    // to access multi- dimension structure in [][] table
//      //==============while loop String with break========

//      while (true){ 
//          
//      String input= sc.next();
//     System.out.println(input);
//     // scanner take input from user and it will keep print input from user 
//    
//     if (input.equals("exit"))break;// it will stop if  user input( stop , exit ) to break;
//     
    // ======================While loop int with break

    // ask user to puyt number between 1-100
    // if user not put number in range, program should ask again

    int num;
    while (true) {

        System.out.print("Please put number between  1-100");
        num = sc.nextInt();

        if (num > 0 && num <= 100)
            break;
        System.out.println("Number is not in 1-100 range");
    }
    System.out.println(num); // it will print num non stop

}




	
	
}

