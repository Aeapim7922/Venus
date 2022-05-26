package day12_nestedloop;

import java.util.Scanner;

public class TimerII {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("How long you want to wait for ?");
        Scanner sc = new Scanner(System.in);

        int waitTime = sc.nextInt();
        System.out.println(waitTime + " Timer Start!");
        
        for (int i = waitTime-1; i >= 0; i--) {
        	
            for (int j = 59; j >= 0; j--) {
                System.out.println(i + ":" + j);
                
                Thread.sleep(1000);
            }
        }

        System.err.println("Time's UP!!!");
    
	}

}
