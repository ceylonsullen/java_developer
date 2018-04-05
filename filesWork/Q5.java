package filesWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\src\\week5day2";
		String locationStudents = path + "\\students.csv";
		File students = new File(locationStudents);
		String locationNames = path + "\\names.txt";
		File names = new File(locationNames);
		String locationGrades = path +"\\grades.txt";
		File grades = new File(locationGrades);
		String locationGpas = path + "\\gpas.txt";
		File gpas = new File(locationGpas);
		FileWriter writer;
		try {
			writer = new FileWriter(students);
			writer.write("name,grade,gpa\n");
			for (int i = 0; i < 10; i++) {
				Scanner ScN = new Scanner(names);
				for  (int j = 0;j < i; j++) {
					ScN.nextLine();
				}
				writer.write(ScN.nextLine() + ",");
				ScN.close();
				Scanner ScG = new Scanner(grades);
				for  (int j = 0;j < i; j++) {
					ScG.nextLine();
				}
				writer.write(ScG.nextLine() + ",");
				ScG.close();
				Scanner ScP = new Scanner(gpas);
				for  (int j = 0;j < i; j++) {
					ScP.nextLine();
				}
				writer.write(ScP.nextLine() + ",\n");
				ScP.close();
				
			}
			writer.close();
		} 
		catch (IOException e) {
			System.out.println("cannot access file or location");
		}

		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Scanner scS = new Scanner(students);
			scS.nextLine();
			while (scS.hasNextLine()) {
				String[] line = scS.nextLine().split(",");
				Student student = new Student(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]));
				studentList.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student s : studentList ) {
			s.getInfo();
		}
	}

}
