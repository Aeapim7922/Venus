package Day5_operator;

public class LogicalOperator {
public static void main(String[] args) {
	 
	//&& , || , !
	
	// && AND
	
	/* 
	 * 
	 */
	int a =10;
	int b =5;
	int c =5;
	
	boolean conditionA = a+b == c; //f
	boolean conditionB = c-b ==a; //f
	
	System.out.println(conditionA && conditionB); //F
	
	conditionA = a+ c >=30; //f
	conditionB = c+b == a; //t
	
	boolean
	 result = conditionA && conditionB ;
	
	System.out.println(result);//F
	
	//======================================================
	
	// or || 
	
	a = 1;
	b = 2;
	 c = 3;
//	 
	 conditionA = c-b ==12; //f
	 conditionB = b-a ==c; //F
	 
	 System.out.println(conditionA || conditionB); //f
	 
	 //logical not!
	 /*
	   !true == false
	   !false== true
	   
	**/ 
	 
	 conditionA =false;
	 conditionB =false;
	 
	 System.out.println(conditionA); //F
	 System.out.println(conditionB); //F
	  
	   

	   
	  
	 
	 
	 
	
		
}
}
