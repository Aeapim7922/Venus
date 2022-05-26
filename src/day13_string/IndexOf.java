package day13_string;

import javax.sql.rowset.serial.SQLOutputImpl;

public class IndexOf {
	public static void main(String[] args) {
		            //012345678910  15 17
		String name ="President George Washington";
		
		
//	    System.out.println(name.charAt(8));
//	    System.out.println(name.charAt(9));
//	    System.out.println(name.charAt(10));
//	    System.out.println(name.charAt(17));
//	   
//	    
//	    System.out.println(name.indexOf('p'));
//	  System.out.println(name.indexOf('p'));
//	  
//	  System.out.println(name.indexOf('e'));
	  System.out.println(name.indexOf('e', 5));//6
			 
	  System.out.println(name.indexOf('e',8));//11
//	  
//	  System.out.println(name.indexOf('e'));
//	  
//	  System.out.println(name.indexOf("George"));
//	  
//	  System.out.println(name.indexOf("rge"));
//	  
//	  System.out.println(name.indexOf("Bob"));
//	  
//	  System.out.println(name.indexOf("George") >-1);//true
//	  
//	  System.out.println(name.indexOf("bob") >-1);//false
//	    
	 
	    
	    
	}

}
