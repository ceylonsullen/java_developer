package filesWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location1 = "C:\\Users\\Students\\Desktop\\courseCode.txt";
		File courseCode = new File(location1);
		String location2 = "C:\\Users\\Students\\Desktop\\courseName.txt";
		File courseName = new File(location2);
		FileWriter writer1;
		FileWriter writer2;
		try {
			writer1 = new FileWriter(courseCode, false);
			writer1.write("CS235\n");
			writer1.write("CS334\n");
			writer1.close();
			writer2 = new FileWriter(courseName, false);
			writer2.write("Object Oriented Programming II\n");
			writer2.write("Intro to machine learning\n");
			writer2.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		ArrayList<String> codes = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		try {
			Scanner file1 = new Scanner(courseCode);
			while (file1.hasNextLine()) {
				codes.add(file1.nextLine() + "\n");
			}
			file1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Scanner file2 = new Scanner(courseName);
			while (file2.hasNextLine()) {
				names.add(file2.nextLine() + "\n");
			}
			file2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < (names.size() > codes.size() ? codes.size() : names.size()); i++) {
			System.out.println(codes.get(i).trim() + " - " + names.get(i).trim());
		}
	}

}
