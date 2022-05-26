package day15_4ThReview;

public class StringFirstHalf {
public static void main(String[] args) {
	
//	## Task - First Half
//
//	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//	## Task - Middle Two
//
//	Given a string of even length, return a string made of the middle two chars, so the string "string"
//	yields "ri". The string length will be at least 2. (edited)
//	[1:51 PM]
	      // String sequence of character
	      // "...some string..."

	      String name = "Hello";
	      // String is reference type
	      String secondName = new String("World");

	      // String can be empty
	      String thisIsEmpty = "";
	      // String can store only one Character
	      String s = "s";
	      char S = 's'; // this is not the same as above

	      // String can be null
	      String thisIsNull = null;
	      String str; // null
//	      System.out.println(thisIsNull); // => null
//	      System.out.println(thisIsEmpty); // => will not print anything

//	      System.out.println(thisIsNull.toLowerCase()); // => NPE
//	      System.out.println(str.toLowerCase()); // => this will not compile
	 //(edited)
	//[1:52 PM]
	      // find Length and Character
	      // .lenght() => int, number of character of the string
//	                        1234567890
	      //                            12345
	      String something = "something wrong";
	      int lenghtOfSthg = something.length(); // => 15

	      // .charAt() => char,
	      // return character of given index
	      // parameter index always start from 0

	  //                0123456789
	  //                          01234     last index = 14
	      String strA= "something wrong";
	      char letter = strA.charAt(13); //
	      System.out.println(letter); // => n
	      strA.length(); // => 15

	      char firstLetter = strA.charAt(0);
	      char lastLetter = strA.charAt(strA.length() - 1);
}
}
