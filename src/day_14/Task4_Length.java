package day_14;

public class Task4_Length {
	public static void main(String[] args) {
//		write a program that can check if the first and last characters of the string are same
//        ex:
//            level
//        output:
//            same
		String str ="PhimniphaP";
		
		char first = str.charAt(0); //P
        char last = str.charAt(str.length() - 1);//10-1=9 it's P
        
        if(first == last) {
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }

    }


	}


