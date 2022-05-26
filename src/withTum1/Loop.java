package withTum1;
import java.util.Scanner;
public class Loop{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 for(int i = 1; i<=3; i++) {
				 
		System.out.println("Enter the License Plate");
		String word1 = sc.nextLine();
		
		System.out.println("Enter the make");
		String world2 = sc.nextLine();
		
		System.out.println("Enter the Model");
		String world3 = sc.nextLine();
		
		System.out.println("Enter the Year");
		int a = sc.nextInt();
		
		System.out.println("Enter the color");
		String world4 = sc.next();
		
		System.out.println("Enter the Mileage");
		 
		double b = sc.nextDouble();
		 
		double price = 0;
		
	 System.out.println("Conventional Oil");{
            
     System.out.println("High-Mileage Oil");
            		
     System.out.println("Synthelic Oil");
     int service=sc.nextInt();
     if(service==1) {
    	 price = 31.99;
    	 
     } if(service ==2) {
    	 price = 49.99;
    	 
     }if(service == 3) {
    	 price = 75.99;
     }
     
     
     
      System.out.println("Please Select the service package");
		
		System.out.println("Vehicle Information;");
		System.out.println("Lincense Plate:" + word1);
		System.out.println("Make/Model:" + world2);
		System.out.println("Year:" + a);
		System.out.println("Color:" + world4);
		System.out.println("Mileage" + b);
		System.out.println("Your service fee Tax included:" + price);
	}
		 }

	}
}
