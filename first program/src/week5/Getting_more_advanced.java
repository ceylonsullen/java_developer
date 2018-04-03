/**
 * Auto Generated Java Class.
 */

package week5;
import java.util.Scanner;

import week5.Students;

public class Getting_more_advanced {
    
    
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        Students[] arr= new Students[3];
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println();
            arr[i] = new Students("", 0, 0);
            System.out.println("enter your first name");
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
