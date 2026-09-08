
package Lessons.week2;

/*@author Slate*/
public class arithmeticoperator {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("This is addition: " + (a + b));
        System.out.println("This is subtraction: " + (a - b));
        System.out.println("This is multiplication: " + a * b);
        System.out.println("This is division: " + a / b);
        System.out.println("This is a remainder(modulus): " + a % b);
        
        System.out.println("===================");
        
        int whole = 7;
        double decimal = 2.0;
        double result = whole/decimal; /* 7/2.0 */
        System.out.println(result);
        
        System.out.println("===================");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("This is Max Range Value of INTEGER: "+ max);
        System.out.println("This is Min Range Value of INTEGER: "+ (min));
    }
    
    
    
    
    
}
