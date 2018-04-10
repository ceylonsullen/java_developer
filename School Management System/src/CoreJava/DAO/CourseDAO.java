package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
    public List<Course> getAllCourses(){
    	List<Course> courses = new ArrayList<Course>();
    	String path = System.getProperty("user.dir") + "\\courses.csv";
    	File file = new File(path);
    	try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				Course course = new Course();
				course.setID(Integer.parseInt(line[0]));
				course.setName(line[1]);
				course.setInstructor(line[0]);
				
				courses.add(course);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return courses;
    }
}
