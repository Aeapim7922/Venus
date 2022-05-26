package day15_4ThReview;

public class StarShapeTask {
	public static void main(String[] args) {
		
		char star = '*';
		char space = ' ';
		int n = 5;
		
		for(int i = 0; i < n; i++) {// run 5 times
		for( int j =0; j < n; j++) {// print 5 times 
		   System.out.print(star); // print 5 stars
		   System.out.print(space);
	   }
		System.out.println();
	}

}
}