package day9_control_flow_loop;

public class ContinueStatement {
	public static void main(String[] args) {
		
////		int a = 1;
////		
////		while (a < 11) {
////			if  (a!=5) {
////			System.out.println(a);
////			}
////			a++;
////		}
////		
////	}
//	
//
//////////////////////////////////////////////////////////////////
//
//
//
//for (int a = 20; a < 30; a++) {
//	System.out.println(a);
//	
//
//
//
//
/////////////////////////////////////////////////////////////
//	
//	 System.out.println("While Loop");
//     int num = 20;
//     while(num <= 33) {
//         System.out.println(num);
//         num++;
//     }
//     
//     System.out.println("Current value of varaible num is "+ num);
//     
//     num = 20;
//     
//     System.out.println("Do while loop");
//     
////     do {
////         your code
////     }while (condition is true);
//     
//     do {
//         System.out.println(num);
//         num++;
//     }while(num <= 30);
//     
//     System.out.println("For loop");
//     
////     for (statement1 ; statement2 ; statement3) {
////         your code
////     }
//     
//     //for (int i = 20;i < 31; i++) {
//       //  System.out.println(i);
//         //////////////////////////////////////////
//         
//         int sum = 0;
//         
//         for(int i = 1; i <= 100; i++) {
//             sum = sum + i;
//         }
//         System.out.println("The sum of number 1 to 100 is " + sum);
//         
//         int x = 1;
//         int y = 100;
//         int summ = 0;
//
//         while (x <= y) {
//             x++;
//             summ+=x;// sum = sum +1
//         }
//         System.out.println(sum);
//         ///////////////////////
//         
//         int summm = 0;
//         
//         for (int i = 1 ; i < 11 ; i++) {
////             System.out.println(i);
//             //sum = sum + i;
//             summm += i;
//         }
//         
//         System.out.println("Summm = "+ summm);
//         
//         System.out.println(1+2+3+4+5+6+7+8+9+10);
//         
//         
//         
//     }
//     }
//}
//

//////////////////////////////////////////////////////////////////	
int count = 0;
System.out.println("Loading 0%");
System.out.println("Loading 10%");
System.out.println("Loading 20%");
System.out.println("Loading 30%");
System.out.println("Loading 40%");
System.out.println("Loading 50%");
System.out.println("Loading 60%");
System.out.println("Loading 70%");
System.out.println("Loading 80%");
System.out.println("Loading 90%");
System.out.println("Loading 100%");
//เมื่อใช้ Control Statement แบบทำซ้ำ while


while (count <= 100) { // ทำงานภายใน while loop เมื่อเงื่อนไขเป็นจริง
   System.out.println("Loading " + count + "%");
   count = count + 10;
   
}
	}
}
///////////////////////////////////////////////////////////////////////

