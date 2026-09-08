
package Lessons.week1;

/*
 * @author Slate
 */
public class narrowingtypecasting {
        public static void main(String[] args) {
        
        double a = 150.75; /* double to byte */
        int b = (int) a;
        byte c = (byte) b;
        
        System.out.println("This is a double: "+a);
        System.out.println("This is an int: "+b);
        System.out.println("This is a byte: "+c);
      
        
        int num = 123;
        String str = String.valueOf(num);
        String str1 = Integer.toString(num);
        
        System.out.println(str);
        System.out.println(str1);
         

        


    }
    
    
}
