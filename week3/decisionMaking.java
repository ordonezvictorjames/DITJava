
package Lessons.week3;

public class decisionMaking {
    public static void main(String[] args) {
        
        System.out.println("===========IF Statement===========\n");
        int age = 18;
        if (age >= 18){
            System.out.println("Eligible to Vote");
        }
        System.out.println("==================================\n");
        
        System.out.println("Compound Condition\n");
        int score = 86;
        boolean hasSubmitted = true;
        
        if(score >= 75 && hasSubmitted){
            System.out.println("Requirement Met:");
        }
        
        
        System.out.println("\n===========IF ELSE Statement===========\n");
        int scores = 45;
        if (scores >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        System.out.println("\nEven and Odd");
        int n = 7;
        if (n % 2 == 0){    /* 7 % 2 = 0 */
            System.out.println(n + " Number is even");
        }else{
            System.out.println(n + " Number is odd");
        }
        
        System.out.println("\nAssigning Result From IF ELSE");
        int a = 10, b  = 20;
        int max;
        if (a > b){
           max = a;
           System.out.println("A is Max = " + max);
        }else{
            max = b;
            System.out.println("B is Max = "+ max);
        }
        System.out.println(max);
        
        
        System.out.println("===========ELSE IF Statement===========\n");
        
        
        int month = 12;
        if (month == 12 || month <=2){
            System.out.println("Winter");
        }else if (month <= 5){
            System.out.println("Spring");
        }else if (month <= 8){
            System.out.println("Summer");
        }else{
            System.out.println("Fall");
        }
        
        System.out.println("\nGrade Ladder");
        int finalscore  = 84;
        char grade;
        
        if (finalscore >= 90) grade = 'A';
        else if (finalscore >= 80) grade = 'B';
        else if (finalscore >= 75)  grade = 'C';
        else grade = 'F';
        System.out.println(grade);
        
        System.out.println("\n===========NESTED IF ELSE Statement===========\n");
        String username = "admin";
        String password = "abc";
        
        if (username.equals("admin")){
            if(password.equals("1234")){
                System.out.println("Login Successful");
            }else{
                System.out.println("Wrong Password");
            }
        
        }else{
            System.out.println("Wrong Credentials");
        
        }
        
        
        System.out.println("\nGrading with NESTED IF ELSE");
        
        int finalscores = 85;
        boolean metAttendance = true;
        
        if (metAttendance) {
            if (finalscores >= 85){
                System.out.println("PASSED");
            }else{
                System.out.println("Failed(LOW SCORE)");
            }
        }else{
            System.out.println("Failed (ATTENDANCE)");
        }
        
        
        System.out.println("\n===========SWITCH CASE Statement===========\n");
        int day = 7;
        switch (day) {
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                default: System.out.println("Others");
        }
        
        
        /* IF ELSE STATEMENT
            DIFFERENT CONDITIONS
        */
        
        /* SWTICH STATEMENT
            ONE VARIABLE BUT MANY POSSIBLE VALUES
        * /
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
