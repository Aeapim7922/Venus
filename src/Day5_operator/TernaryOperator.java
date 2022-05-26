package Day5_operator;

public class TernaryOperator {
	public static void main(String[] args) {
		
	
	
	// syntax:
//	variable = (condition) ? trueBlock : falseBlock;
	
	int a, b;
	a =10;
	
	b = (a != 1) ? 5: 60; //it is F
	
	System.out.println(b); //60
	
	System.out.println("Value of b is ");
	
	System.out.println("Value of b is " + b + " Obbie"); // is 60
	
	
	String result = (b % 2 == 0) ? "even number" : "odd number";
	
	System.out.println(result ); // even number
	
	b =11;
	  
	result = (b % 2 !=0) ? "even number " : "odd number";
	 
	System.out.println(result );// odd number
	//=======================================================
	
	
	 

}
}
