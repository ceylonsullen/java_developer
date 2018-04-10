package CoreJava.DAO;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import CoreJava.Models.Student;

import java.util.List;




public class StudentDAO {
    public List<Student>  getStudents(){
    	List<Student> students = new ArrayList<Student>();
    	String path = System.getProperty("user.dir") + "\\students.csv";
    	File file = new File(path);
    	try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				Student student = new Student();
				student.setEmail(line[0]);
				student.setName(line[1]);
				student.setPass(line[2]);
				
				students.add(student);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return students;
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
    	for (int index = 0; index < studentList.size(); index++) {
        	if (studentList.get(index).getEmail().equals(studentEmail)) return studentList.get(index);
    	}
    	return null;
    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
    	for (int index = 0; index < studentList.size(); index++) {
        	if (studentList.get(index).getEmail().equals(studentEmail) && studentList.get(index).getPass().equals(studentPass) ) return true;
    	}
    	return false;
    }
}
