package day12_nestedloop;

public class TimerWithNestedForLoop {
	

	public static void main(String[] args) throws InterruptedException {

      // print timer running down 60 second in 15 minute

        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
          
           for (int j = 59; j >= 0; j--) {
                System.out.println(i + ":" + j);
               
                Thread.sleep(1000);

            }
        }
	}
}

//////////////////////////////////////
