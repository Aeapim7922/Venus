package day15_4ThReview;

public class StringMethodDemo {
	public static void main(String[] args) {
		
		// String sequence of character
        //".....some String..."
        
        String name = "Hello";
        // String is reference type
        String secondName = new String("world");
        
        // String can be empty
        String thisIsEmpty= " ";
        
        //can store only 1 character
        char  a = 'a';
        char  A = 'a';// they are not equal
        
       // String can be null
          String thisIsNull = null;
          String str; // null
          System.out.println(thisIsNull); // => null
          System.out.println(thisIsEmpty); // => will not print anything

          
       //   System.out.println(thisIsNull.toLowerCase()); // => NPE
       // System.out.println(str.toLowerCase()); // => this will not compile
             
    }
        
   
		
	}


