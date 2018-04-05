package filesWork;

import java.util.Scanner;

public class Student {
	Student(String n, int gr, double gpa) {
		this.name = n;
		this.grade = gr;
		this.gpa = gpa;
	}
	Student() {};
	private String name;
	private int grade;
	private double gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void readInputs(Scanner sc) {
		System.out.println("student name: ");
		this.name = sc.nextLine();
		System.out.println("student grade: ");
		this.grade = Integer.parseInt(sc.nextLine());
		System.out.println("student name: ");
		this.gpa = Double.parseDouble(sc.nextLine());
	}
	
	public void getInfo() {
		System.out.println("My name is " + this.name + 
				". I'm in grade " + this.grade + 
				" and I have a " + Double.toString(this.gpa) + 
				". At least for now..." );
		
	}
}
