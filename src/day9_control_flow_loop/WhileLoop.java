package day9_control_flow_loop;
import java.util.Scanner;
public class WhileLoop {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    int faktoriyel = 1;
   
    System.out.println("enter you numb: ");
    int num = scan.nextInt();
    
    while(num  > 0) {
        faktoriyel *= num;
        num--;
    } 
    System.out.println("Faktoriyel = " + faktoriyel);
    
}
}
