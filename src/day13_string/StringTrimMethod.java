package day13_string;

public class StringTrimMethod {
public static void main(String[] args) {
	
	String str1 ="         Hello";
	
	System.out.println(str1.length());
	
	System.out.println(str1);
	
	str1 = str1.trim();
	
	System.out.println(str1.length());//5
	
	System.out.println(str1);// no space
	
	
	String str2 = "                     hello              ";
	System.out.println(str2.length());
	
	System.out.println(str2);
	
	str2 = str2.trim();
	System.out.println(str2);
	
	String name = "      President George Washington     ";// count after n is last digit
	System.out.println(name.length());
	
	name = name.trim();
	System.out.println(name.length());
	
}
}
