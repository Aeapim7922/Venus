package day13_string;

public class StringEqualMassage {

	public static void main(String[] args) {
		
		String str1 ="Pim";
		String str2 = "pim";
		
		System.out.println(str1.equals(str2));//false
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		if (str1.equals(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("not equal");
		}
		
		
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		//return true if the string word1 is equal to word2
		System.out.println();
		//boolean b = word1.equalsIgnoreCase(word2);
		//return true if the string word1 matches word2, case-blind
		
		
		
	}
}
