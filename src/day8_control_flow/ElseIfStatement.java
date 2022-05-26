package day8_control_flow;
import java.util.Scanner;
public class ElseIfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int x = 0;
        for(int i = 1; i <=5; i++) {
            System.out.printf("Please enter %d number: ", i);
            int input = sc.nextInt();
            if (input > x) {// input = 6/ 6>0 = true
                x = input; // then x = 6
                           // input = 5/ 5>6 = false (stop)!!
            }
        }
        System.out.println("Max= " + x);
  
    

		
	}
}
