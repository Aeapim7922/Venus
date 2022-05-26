package day_14;

public class NumberToString_ValueOf {
public static void main(String[] args) {
	
	long a = 123456L;
	 String valueA = String.valueOf(a);
	 System.out.println(a);//123456
	
	 System.out.println(valueA);//123456
	 System.out.println(valueA.length());//6
	 
	 short s = 31542;
	 String valueS = String.valueOf(s);
	 System.out.println(valueS.length());//5
	 System.out.println(valueS.charAt(2));//5
}
}
