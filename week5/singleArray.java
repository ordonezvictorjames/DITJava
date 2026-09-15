/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lessons.week5;

import java.util.Arrays;

/**
 *
 * @author Slate
 */
public class singleArray {
    public static void main(String[] args) {
        
        System.out.println("===========SINGLE ARRAY===========");
        int[] grades = {75,74,73,78,79};
        
        
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println("Total Grade: " +grades.length);
        
        System.out.println("=".repeat(34));
        System.out.println();
        
        
        
        System.out.println("===========MULTI-DIMENSIONAL ARRAY===========");
        
       int[][] grid = {
                     /*0 1*
        /*Array 0*/   {1,2},      /*1*/
        /*Array 1*/   {3,4}       /*2*/
       };                         /*4*/
       
       
       
        System.out.println(grid[0][0]);
        System.out.println(grid[0][1]);
        System.out.println(grid[1][1]);
        
        System.out.println("=".repeat(34));
        System.out.println();
        
        
        System.out.println("===========ARRAY PROCESSING===========");
        
       int[] dit23 = {71,72,75,78};
       int total = 0;
       
       for (int i = 0; i < dit23.length; i++){
           total += dit23[i];
           
       double average = total/(double)dit23.length;
           System.out.println("Total: " + total);
           System.out.println("Average: " + average);
       }
        System.out.println("=".repeat(34));
        System.out.println();
        
        
        System.out.println("=========== SEARCH ===========");
        
        int[] scores = {85,90,78};
        int target = 85;
        int foundAt = -1;
        
        for (int i = 0; i <scores.length; i++){
            if(scores[i] == target){
                foundAt = i;
        }
    }
            System.out.println("Found at index: " + foundAt);
        
        
        System.out.println("=".repeat(34));
        System.out.println();
        
        
        System.out.println("=========== SORTINT ===========");
        
        int[] testscores = {90,78,65};
        Arrays.sort(testscores);
        
        System.out.println(Arrays.toString(testscores));
        
        System.out.println("=".repeat(34));
        System.out.println();
        
        
        System.out.println("=========== ARRAY OF OBJECTS ===========");
         class Student{
             String name;
             int studentscore;
             int studentage;
             Student(String name, int score, int age){
                 this.name = name;
                 this.studentscore = score;
                 this.studentage = age;
             }
         }
         
         Student[] list = new Student[5];
         list[0] = new Student("Ana", 90, 15);
         list[1] = new Student("Ben", 85, 14);
         list[2] = new Student("Ben1", 84, 13);
         list[3] = new Student("Ben2", 86,12);
         list[4] = new Student("Ben3", 87, 11);
         
         System.out.println("Student Name: " + list[0].name + " Student Score: " + list[0].studentscore + " Student Age: " + list[0].studentage);
         System.out.println(list[1].name + ": " + list[1].studentscore);
         System.out.println(list[2].name + ": " + list[2].studentscore);
         System.out.println(list[3].name + ": " + list[3].studentscore);
         System.out.println(list[4].name + ": " + list[4].studentscore);
         
         
         
         
        
    }
    
}
