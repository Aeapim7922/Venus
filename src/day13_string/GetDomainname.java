package day13_string;

public class GetDomainname {
public static void main(String[] args) {
	
	//help@walmart.com
	//help@aws.com
	//help@uscis.gov
	//help@github.com
	//              01234
	String email = "help@walmart.com";
	System.out.println(email.indexOf('@'));//4
	
	System.out.println(email.substring(4));//
	System.out.println(email.substring(4+1));
	System.out.println(email.lastIndexOf('.'));
	
	System.out.println(email.substring(4 + 1, 12));
	
	int startingIndex = email.indexOf('@') + 1;
	int endingIndex = email.lastIndexOf('.');
	
	String domainName = email.substring(startingIndex, endingIndex);
	System.out.println(domainName);
}

}
