/**
 * Auto Generated Java Class.
 */

package week5;
import java.util.Scanner;

import week5.Students;

public class Area_calculator {
    
    public static double area_circle(int radius) {
        return radius * radius * Math.PI;
    }  // returns the area of a circle
    public static int area_rectangle(int a, int b) {
        return a * b;
    }  // returns the area of a rectangle
    public static int area_square(int a)  {
        return a * a;
    }    // returns the area of a square
    public static double area_triangle(int w, int h) {
        return 0.5 * w * h;
    } // returns the area of a triangle
    
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Shapes: \n1. circle \n2. rectangle \n3. square \n4. triangle \nWhich shape would you like to get the area of?");
        choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("what is the radius?");
                int radius = input.nextInt();
                System.out.println("the area of your circle is " + area_circle(radius));
                break;
            case 2:
                System.out.println("what is the length?");
                int length = input.nextInt();
                System.out.println("what is the width?");
                int width = input.nextInt();
                System.out.println("the area of your circle is " + area_rectangle(length, width));
                break;
            case 3:
                System.out.println("what is the length of one side?");
                int side = input.nextInt();
                System.out.println("the area of your circle is " + area_square(side));
                break;
            case 4:
                System.out.println("what is the height?");
                int height = input.nextInt();
                System.out.println("what is the length of the base?");
                int base = input.nextInt();
                System.out.println("the area of your circle is " + area_triangle(height, base));
                break;
        }
    }
    
    /* ADD YOUR CODE HERE */
    
}
