package day_14;

public class Task15 {
public static void main(String[] args) {
	
//	Write a program to extract digits from a String:
//	     input: ab123c4d56efg
//	     output:123456
	
//	String str = "abc123defabckhgabc";
//	String output = "";
//	for(int i = 0; i < str.length() - 1; i ++) {
//			
//		if(!output.contains(str.substring(i, i+ 1))) {
//			output += str.charAt(i);
			
		//}					
	//}
	
	String input = "ab123c4d56efg";
	String extractNum = input.replaceAll("[^0-9]" ,"");
	

	System.out.println(extractNum);
 System.out.println("hello");

}
}
