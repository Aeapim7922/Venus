package day13_string;

public class StringReplaceMethod {
public static void main(String[] args) {
	
	String word ="car";
	       word = word.replace('r' , 't');
	       System.out.println(word);//cat
	       
	String str = "tomato" ;
	System.out.println(str);
	
	str = str.replace('t', 'p');
	System.out.println(str);//pomapo
	
	
	String str2 = "tomato" ;
	System.out.println(str);
	
	str2 = str2.replace("to", "MO");
	System.out.println(str2);//MOmaMo
	
	String str3 = "How Turkey spoinled NATO's hidtoric moment with Finland, Sweden";
	
	str3 = str3.replace("Turkey", "India");
	System.out.println(str3);
	
	str3 = str3.replace(" ", "");
	System.out.println(str3);
	
	String word2 = "Hello Techcircle";
	word2 = word2.replace("TechCircle", "Irfan");
	System.out.println(word2);
	
}
}
