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
			writer = new FileWriter(students, false);
			writer.write("name,grade,gpa\n");
			Scanner ScN = new Scanner(names);
			Scanner ScP = new Scanner(gpas);

			Scanner ScG = new Scanner(grades);
			for (int i = 0; i < 10; i++) {
				
		
				writer.write(ScN.nextLine() + ",");
			
				writer.write(ScG.nextLine() + ",");
			
				writer.write(ScP.nextLine() + "\n");
				
			}
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
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
			scS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student s : studentList ) {
			s.getInfo();
		}
	}

}
