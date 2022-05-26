package day2_variables;

import java.awt.Point;

public class primitiveVSReference {
public static void main(String[] args) {
	System.out.println();
	int x = 1; // initialize x to1
	int y = x; // assign x into y
	
	System.out.println(y);
	
	x = 2; // reassign x to 2
	System.out.println("x="+x+",y="+y);
	
	y = x;
	System.out.println(x);
	//=====================================
//			
	 
final byte DAY_OF_THE_WEEK =7; // naming conversation = screaming snake case
final short NUMBER_OF_MONTH = 12;
final double PI = 3.14;
//PI = 2.5; // cannot be reassigned
//DAY_OF_THE_WEEK = 8;
//
// naming convention
//Class name = Pascal case
// Variable & method name = camelCase
// Final Variable/ constant = CSREAMING_SNAKE_CASE
//
System.out.print("Hello");
System.out.print("World");
System.out.printf("HelloWorld");
//// %s = string
//// %d = digit (byte, short, int, long)
//// %f = float (float, double)
//// %b = boolean
//// %.2f = 3.4567=> 3.45, %.1f 45.231=> 45.2
// 
int age = 31;
boolean isEligible = false;
String message = "World";
System.out.printf("Hello %s! Leng is %d",message,age); 

System.out.printf("leng is %d years old.",age);
System.out.printf("Ptice is %.3f cheaper",4.35);
System.out.printf("%b is not eligible", isEligible);
//
//
//System.out.printf("%s %s %d %f", "My","age",age,3.42);
//System.out.printf();
//
//
//} 

//}

int X = 2;
int Y = x;
System.out.println(y);
 
x = 3;
System.out.println(y);
y = x;
System.out.println(x);
}

} 

