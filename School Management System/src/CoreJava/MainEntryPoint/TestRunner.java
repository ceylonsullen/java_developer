package CoreJava.MainEntryPoint;

import java.util.List;

import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Student;

public class TestRunner {
    public static void main(String[] args) {
        //Test Your Code Here!
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getStudents();
        for (Student s : studentList) {
        	System.out.println(s.getPass() + s.getEmail());
        }
    }
}
