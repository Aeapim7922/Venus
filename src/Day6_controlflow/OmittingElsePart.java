package Day6_controlflow;
import java.util.Scanner;
public class OmittingElsePart {
	 public static void main(String[] args) {
	        // there is no else for this condition but it will keep printing 
	        //  all statement that are not false
	        
	        int n1 =500, n2 =700, n3=300,n4=400;
	        
	        
	        if(n1>n2 && n1>n3 )  {
	            System.out.println("Max number is " + n1);
	            //System.out.println("Min number is " + n2);
	        }
	        else if(n2>n3) {
	            System.out.println("Max number is "+ n2);
	            //System.out.println("Min number is " + n1);    
	        }else {
	        //if (n1==n2) {
	            System.out.println("Max number is "+n3);
	        }
	            
	//===========================    
//	        
//	        Scanner sc = new Scanner(System.in);
//	        int bathTemperature= sc.hashCode();
//	        
//	        if(bathTemperature < 90) {
//	            System.out.println("Brrrr");
//	        }
//	        if(bathTemperature >90) {
//	            System.err.println("That's lukewarm");
//	        }
//	        if(bathTemperature >= 95 && bathTemperature<= 105) {
//	            System.out.println("Perfect");
//	        }
//	        if(bathTemperature>= 105 && bathTemperature<=110) {
//	            System.out.println("That isn't a hot tub");
//	        }
//	        if(bathTemperature>=100) {
//	            System.out.println("Are you trying to boil a lobster");
//	            
//	        }
}
}
