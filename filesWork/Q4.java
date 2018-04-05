package filesWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\week5day2";
		String locationNames = path + "\\names.txt";
		File names = new File(locationNames);
		String locationGrades = path +"\\grades.txt";
		File grades = new File(locationGrades);
		String locationGpas = path + "\\gpas.txt";
		File gpas = new File(locationGpas);
		FileWriter writerNames, writerGrades, writerGpas;
		try {

			writerNames = new FileWriter(names);
			writerNames.write("tom\n"
					+ "jerry\n"
					+ "eric\n"
					+ "deric\n"
					+ "feric\n"
					+ "geric\n"
					+ "charles\n"
					+ "richard\n"
					+ "paul\n"
					+ "peter");
			writerNames.close();

			writerGrades = new FileWriter(grades);
			writerGrades.write("1\n"
					+ "2\n"
					+ "3\n"
					+ "4\n"
					+ "5\n"
					+ "6\n"
					+ "7\n"
					+ "8\n"
					+ "9\n"
					+ "10");
			writerGrades.close();

			writerGpas = new FileWriter(gpas);
			writerGpas.write("1.0\n"
					+ "2.0\n"
					+ "3.0\n"
					+ "4.0\n"
					+ "1.5\n"
					+ "2.6\n"
					+ "3.7\n"
					+ "2.8\n"
					+ "1.9\n"
					+ "1.0");
			writerGpas.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
		double[] gpasFile = new double[10];
		ArrayList<String> namesFile = new ArrayList<String>();
		ArrayList<Integer> gradesFile = new ArrayList<Integer>();
		Scanner file1 = new Scanner(gpas);
		int counter = 0;
		while (file1.hasNextLine() && counter < 10) {
			
				gpasFile[counter] = Double.parseDouble(file1.nextLine().trim());
				counter++;
			
		}
		file1.close();
			


		Scanner file2 = new Scanner(names);
		while (file2.hasNextLine()) {
			namesFile.add(file2.nextLine());
		}
		file2.close();
	

		Scanner file3 = new Scanner(grades);
		while (file3.hasNextLine()) {
			
				gradesFile.add(Integer.parseInt(file3.nextLine()));
		
		}
		file3.close();
		Student[] stews = new Student[10];
		for (int i = 0; i < (gradesFile.size()); i++) {
			stews[i] = new Student(namesFile.get(i), gradesFile.get(i), gpasFile[i]);
		}
		for (Student st : stews) {
			st.getInfo();
		}
		
		
	}
}
