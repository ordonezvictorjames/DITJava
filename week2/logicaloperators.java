
package Lessons.week2;

public class logicaloperators {
    public static void main(String[] args) {
        int age = 19;
        boolean hasLicense = false;
        boolean canDrive = age >= 18 && hasLicense;
        
        System.out.println("Is it allowed to drive? "+canDrive);
        
        
        
        System.out.println("===================");
        
        
        
        int gpa = 3, units = 21;
        boolean hasViolation = false;
        
        boolean eligible = (gpa >=3) && (units >= 18) && !hasViolation;
        System.out.println("Is it allowed to enroll? "+ eligible);
        
        
        
    }
 
}
