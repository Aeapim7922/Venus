package day15_4ThReview;

public class StringLengthAndCharacter {

	public static void main(String[] args) {
		
		// find Length and Character
        // .length() => int, number of character of the String
        // 123456789012345
        String something = "something wrong";
        int lengthOfSthg = something.length();// 15

        System.out.println(lengthOfSthg);

        // .charAt () => char, return character of given index (index start count from
        // 0)
        String str = "something wrong";
        char letter = str.charAt(8);
        System.out.println(letter);

    }


		
	}

