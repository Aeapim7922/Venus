package Day6_controlflow;

public class IfStatement {
	public static void main(String[] args) {
        //Decision making statements
        // if statement and switch case
        
        
        int a = 5;
        int b =7;
        
        if (a>b) {
            System.out.println("a is greater");
        }else {
            System.out.println("b is greater");
        }
    //===================
        int count = 2;
        int total = 4 ;
        
        if( count >3) {
    //    if (count < 3) {
            total=0;
        }else {
            total = total+count;
            System.out.println(total);// 0 or 6
            
}
	}
}
