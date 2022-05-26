package day12_nestedloop;

public class NestedForLoop {
	public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            //System.out.println(j);// when you don't want to show the outer loop
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);

            }
        }
        //================== weeks in 5 months
        int months =5;
        int weeks =4;
        for (months =1;months<=5;months++) {
            System.out.println(" Month:"+ months);
            for( weeks =1;weeks<=4;weeks ++) {
                System.out.println("Week:" + weeks);
            }
            
        }
        //==================12 monthsin 4 years
        int years = 5;
        int monthss =12;
        
        for (years =1; years<=5; years++) {
            System.out.println( " Year "+ years);
            for (monthss=1 ; monthss <+12;monthss++) {
                System.out.println(" Month"+ monthss);
                
            }
        }
	}
}
