/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inte.week4;



import java.util.Scanner;
        
public class scanner {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your name: ");
            String name = sc.nextLine();
        System.out.print("Enter an number: ");
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                    System.out.print("Your number is : "+ number);
            } else{
                System.out.print("Your input is not a number");
                
            }
            
            
        System.out.print("Enter your Tuition fee: ");  
            double tuition = sc.nextDouble();
        System.out.print("Are you enrolled? Y/N: ");     
            String word = sc.next();
        System.out.print("Are you a College Student, True or False: "); 
            boolean tf = sc.nextBoolean();
       /* 
        System.out.println("======================");
        System.out.println("Full Name:" + name );
        System.out.println("Contact Number:" + number );
        System.out.println("Tuition Fee:" + tuition );
        System.out.println("Enrolled?:" + word );
        System.out.println("College Student?:" + tf );
      */
        
        
            
    }   
    
    
}
