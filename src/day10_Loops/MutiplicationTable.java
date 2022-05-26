package day10_Loops;

public class MutiplicationTable {
public static void main(String[] args) {

	
int num = 5;
// 1 x 5 =5
// 2 x 5 = 10

// 10 x 5 = 50( result is 50)

for (int i=1; i<11; ++i){ // For  use when already know the result
	int total = i * num;
	System.out.println(i + " X " + num + " = "+total);
		
	}
	
	int numm = 5;
	for (int i=1; i<=10; ++i) 
	{

    System.out.printf("%d * %d = %d \n", numm, i, numm * i);//????????
        
}
}

   
}

