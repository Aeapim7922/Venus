package Day5_operator;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CalulationwithScanner {
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
    //System.out.println("Enter Number A");
    System.out.println("Enter Number A");
    double numA = sc.nextDouble();
    
    System.out.println("Enter Number B");
    double numB = sc.nextDouble();
    
    System.out.println("Type one of the following operators");
    System.out.println(" + ,  - , * , / ");
    String operator = sc.next();
 
    double total = 0 ;
    
    if (operator.equals("+")) {
        total = numA + numB;
    }

    if (operator.equals("-")) {
        total = numA - numB;
    }
    
    if (operator.equals("*")) {
        total = numA * numB;
    }
    
    if (operator.equals("/")) {
        total = numA / numB;
    }
    
    System.out.println(numA +" "+operator +" " + numB +" = " + total);
    sc.close();
} 
}


