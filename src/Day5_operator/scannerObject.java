package Day5_operator;
import java.util.Scanner;
public class scannerObject {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		//int a = 10;
		//int b = 20;
		
		//int result = a + b;
		
		
		
		//System.out.println(result); //30)
		
		System.out.println("Plase type your name =");
		String name = s.nextLine();
		
		System.out.println("Plase type your year=");
		int year = s.nextInt();
		
		//String b  = s.nextInt();
		//System.out.println(" C = " + a+b);
		
	
		
		//int result = a + b;
		int age = 2022 - year;
		System.out.print("my name is" + name + "im born" + year + "age" +age);
		 
		//s.close();
		
		
	}

}
