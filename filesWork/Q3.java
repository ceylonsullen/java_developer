package filesWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
	
		String path = System.getProperty("user.dir") + "\\src\\week5day2";
		System.out.println(System.getProperty("user.dir"));
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		stu.readInputs(sc);
		String locationNames = path + "\\names.txt";
		File names = new File(locationNames);
		String locationGrades = path +"\\grades.txt";
		File grades = new File(locationGrades);
		String locationGpas = path + "\\gpas.txt";
		File gpas = new File(locationGpas);
		FileWriter writerNames, writerGrades, writerGpas;
		try {

			writerNames = new FileWriter(names);
			writerNames.write(stu.getName());
			writerNames.close();

			writerGrades = new FileWriter(grades);
			writerGrades.write(stu.getGrade());
			writerGrades.close();

			writerGpas = new FileWriter(gpas);
			writerGpas.write(Double.toString(stu.getGpa()));
			writerGpas.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
}
