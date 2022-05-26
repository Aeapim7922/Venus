package homework.May5;
import java.util.Scanner;

public class Trsk2TheAgeOfGroup {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
	    if(age>0) {
	    	 if(age >=1 && age <=2){
                 System.out.println("Age= "+ age + "\ninfancy");

            }else if(age >=3 && age <=4){
                 System.out.println("Age= "+ age + "\nToddler");

            }else if(age >= 5 && age <=7){
                 System.out.println("Age= "+ age + "\nEarly School age");

            }else if(age >= 8 && age <= 12){
                 System.out.println("Age= "+ age + "\nMiddle school age");

            }else if(age >=13 && age <= 17){
                 System.out.println("Age= "+ age + "\nEarly adolescence");

            }else if(age >=18 && age <=25) {
                 System.out.println("Age= "+ age + "\nLater adolescence");

            }else if(age >=26 && age <=30){
                 System.out.println("Age= "+ age + "\nEarly Adulthood");

            }else if(age >= 31 && age <= 50){
                 System.out.println("Age= "+ age + "\nMiddle Adulthood");

            }else if(age >=51){
                 System.out.println("Age= "+ age + "\nAdulthood");
            }

        }else{
            System.out.println("Invalid number");

	sc.close();
        }
    }


	}

