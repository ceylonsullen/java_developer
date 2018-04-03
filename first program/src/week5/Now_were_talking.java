/**
 * Auto Generated Java Class.
 */
package week5;
import java.util.Scanner;

import week5.Students;

public class Now_were_talking {
    
    
    public static void main(String[] args) { 
        int numStudents;
        Scanner input = new Scanner(System.in);
        System.out.println("how many students are we adding?");
        numStudents = input.nextInt();
        Students[] arr= new Students[numStudents];
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println();
            arr[i] = new Students("", 0, 0);
            System.out.println("enter their first name");
            arr[i].setName(input.next());
            System.out.println("enter your grade");
            arr[i].setGrade(input.nextDouble());
            System.out.println("enter your gpa");
            arr[i].setGpa(input.nextDouble());
            total += arr[i].getGpa();
            
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Student " + i + 1 + ": " + arr[i].getName() + " " + arr[i].getGpa()  + " "+ arr[i].getGrade());
        }
        
        System.out.println("average gpa is " + total / 3);
    }
    
    /* ADD YOUR CODE HERE */
    
}
