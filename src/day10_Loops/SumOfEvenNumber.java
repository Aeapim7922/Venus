package day10_Loops;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		
		// write  a java program to print sum of even number between 1 to 10
		// 2 + 4 + 6 + 8 ..100
		
		
//		int num = 1;
//		
//        for( int i =2; i<101; i+=2 ) { //+= is count 2 to 5,8,11
//        	
//            int total = i ++; //++ is the one is change 2,4,6
//        
//        System.out.println(total);
  ////////////////////////////////////////////////////////////////
//        

		//int total = 0;
//		
//		int count = 1;
//		
//		while (count < 101) {
//			if (count % 2 ==0)
//			{
//				total += count; //total = total + count
//				System.out.println(count);
//			}
//			count++;
//			//break;
//			
//			System.out.println(total);
//	
				
				
/////////////////////////////////////////////////////////////////
		//int sum = 0;
		//for (int i = 0 ; i <101 ; i = i +2 ){
			
		//	sum +=i;
		//}
			//System.out.println(sum); //2550
			//
	/////////////////////////////		////////////////////////
			
			int sum = 0;
	        
	        for(int i = 1; i <=10; i++) {
	            if(i % 2 !=0) {// if = 0 is even number==
	            sum = sum + i; // sum +=i;
	            
	            }
	            
	        }    
	        System.out.println("Sum of odd number between 1-100 is " + sum);
	        
			
			
			
			
				
		}
}



        
         
      



        
    
