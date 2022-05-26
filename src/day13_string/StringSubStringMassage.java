package day13_string;

public class StringSubStringMassage {
public static void main(String[] args) {
	            //0123456789
	String str1 = "Television";
	System.out.println(str1.substring(4));//vision
	
	System.out.println(str1.substring(2,5));//lev // take letter 2 -5
	
	//            012345678
	String str2 ="Immutable";
	System.out.println(str2.substring(2));//mutable
	
	String email = "firstName.lastNmae@domainName.com";
	
	String gmail ="irfan.tachcircle@gmail.com";
	
	System.out.println(gmail.indexOf('g'));
	System.out.println(gmail.lastIndexOf('.'));
	
	String domainName = gmail.substring(17,22);
	System.out.println(domainName);
	System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf('.')));
	
	
}
}
