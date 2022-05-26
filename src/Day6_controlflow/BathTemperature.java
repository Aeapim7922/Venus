package Day6_controlflow;

import java.util.Scanner;

public class BathTemperature {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter water temperature");
        
        int bathTemperature =sc.nextInt();
        
        if(bathTemperature < 90) {
            System.out.println("Brrrr");
        }
        if(bathTemperature >90) {
            System.err.println("That's lukewarm");
        }
        if(bathTemperature >= 95 && bathTemperature<= 105) {
            System.out.println("Perfect");
        }
        if(bathTemperature>= 105 && bathTemperature<=110) {
            System.out.println("That isn't a hot tub");
        }
        if(bathTemperature>=100) {
            System.out.println("Are you trying to boil a lobster");
        }
         sc.close();
        
    }
}
    