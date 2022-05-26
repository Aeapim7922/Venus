package day_14;

public class Task16 {
	public static void main(String[] args) {
		 
		
//		Write a program to extract distinct character from a string
//		     input: abcabcabcabc
//		     output:abc
		
		String input = "abcabcabcabc";
		String characters = "";
		String distinctChars = "";

		for (int i = 0; i < input.length(); i++) {
			String currentChar = Character.toString(input.charAt(i));
			
			if (characters.contains(currentChar)) {
				
				if (!distinctChars.contains(currentChar)) {
					distinctChars += currentChar;
				}
			}

			characters += currentChar;
		}
		System.out.println(distinctChars);
		
	}

}
