package homework.May5;

	import java.util.Scanner;

	public class task5 {

		public static void main(String[] args) {
			
			Scanner time = new Scanner(System.in);
			
			System.out.println("What time is it?");
			
			int t = time.nextInt();
			
			if (t>=5 && t<12) System.out.println("Good Morning");
			
			if (t>=12 && t<17) System.out.println("Good Afternoon");
			
			if (t>=17 && t<=24) System.out.println("Good evening");
			
	time.close();
	
			

		}

	}


