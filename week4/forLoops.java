
package Lessons.week4;

public class forLoops {
    public static void main(String[] args) {
        
        System.out.println("===========LOOPS Statement===========\n");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            }
        
        System.out.println("===========WHILE LOOPS Statement===========\n");
    
        int i = 0;
        
        while (i < 5){
            System.out.println(i);
            i++;
        }
        
        
        System.out.println("\n===========LOOPS Statement===========");
       
        for (int word = 1; word  <= 5; word++){
            System.out.println("Hello");
        
        }
        
        System.out.println("\n===========WHILE LOOPS Statement===========");
        
        int passwordAttempt = 0;
        while (passwordAttempt < 3){
            System.out.println("Enter Password");
            passwordAttempt++;
        }
        
        
        
        System.out.println("\n===========DO WHILE LOOPS Statement===========");
        
        int x = 10;
        
        do {System.out.println("RUN AT LEAST ONCE: " + x);}
        while(x < 5);
        
        
        
        
        System.out.println("\n===========NESTED  LOOPS Statement===========");
        for (int loop = 1; loop <= 3; loop++){                 /* loop  = 1 (3 times) */
            for (int nested = 1; nested <= 5; nested++){        /* nested  = 1 (5 times) */    
                System.out.print(loop * nested + "\t");      /* 1 x 1 = 1 */
                                                                /* 1 x 2 = 2 */
            }                                                    /* 1 x 3 = 3 */
            System.out.println();                               /* 1 x 4 = 4 */
        }                                                       /* 1 x 5 = 5 */
        
                                                                /* 2 x 1 = 2 */
                                                                /* 2 x 2= 4 */
                                                                /* 2 x 3 = 6 */
                                                                /* 2 x 4 = 8 */
    }                                                           /* 2 x 5 = 10 */
                                        
}
                                                                /* 3 x 1 = 3 */
                                                                /* 3 x 2 = 6 */
                                                                /* 3 x 3 = 9 */
                                                                /* 3 x 4 = 12 */
                                                                /* 3 x 5 = 15 */