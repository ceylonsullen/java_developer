package week5;
import java.util.Scanner;

import week5.Students;

public class Students_main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade, gpa;
		String name;
		System.out.println("enter your name");
		name = input.nextLine();
		System.out.println("enter your grade");
		grade = input.nextDouble();
		System.out.println("enter your gpa");
		gpa = input.nextDouble();
		Students student1 = new Students(name, grade, gpa);
		input.nextLine();
		System.out.println("enter your name");
		name = input.nextLine();
		System.out.println("enter your grade");
		grade = input.nextDouble();
		System.out.println("enter your gpa");
		gpa = input.nextDouble();
		Students student2 = new Students(name, grade, gpa);
		input.nextLine();
		System.out.println("enter your name");
		name = input.nextLine();
		System.out.println("enter your grade");
		grade = input.nextDouble();
		System.out.println("enter your gpa");
		gpa = input.nextDouble();
		Students student3 = new Students(name, grade, gpa);
		System.out.println(student1.getName() + " has a gpa of " + student1.getGpa() + " and is in grade " + student1.getGrade());
		System.out.println(student2.getName() + " has a gpa of " + student2.getGpa() + " and is in grade " + student2.getGrade());
		System.out.println(student3.getName() + " has a gpa of " + student3.getGpa() + " and is in grade " + student3.getGrade());
	}
}
