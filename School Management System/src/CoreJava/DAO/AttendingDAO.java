package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

    public List<Attending> getAttending(){
    	List<Attending> attendings = new ArrayList<Attending>();
    	String path = System.getProperty("user.dir") + "\\attending.csv";
    	File file = new File(path);
    	try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				Attending attending = new Attending();
				attending.setCourseID(Integer.parseInt(line[0]));
				attending.setStudentEmail(line[1]);
				
				attendings.add(attending);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return attendings;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	for (Attending a : attending) {
    		if (a.getStudentEmail() == studentEmail && a.getCourseID() == courseID) return;
    	}
    	Attending nattend = new Attending();
    	nattend.setCourseID(courseID);
    	nattend.setStudentEmail(studentEmail);
    	attending.add(nattend);
    	saveAttending(attending);
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    	List<Course> studentCourses = new ArrayList<Course>();
    	List<Integer> courseIds = new ArrayList<Integer>(10); 
    	for (Attending a : attending) {
    		if (a.getStudentEmail().equals(studentEmail)) {
    			courseIds.add(a.getCourseID());
    		}
    	}
    	for (Integer i : courseIds) {
    		for (Course c : courseList) {
    			if (i.equals(c.getID())) {
    				studentCourses.add(c);
    			}
    		}
    	}
    	return studentCourses;
    }

    public void saveAttending(List<Attending> attending){
    	String path = System.getProperty("user.dir") + "\\attending.csv";
    	File file = new File(path);
    	FileWriter writer;
    	try {
    		writer = new FileWriter(file);
    		for (Attending a : attending ) {
    			writer.write(a.getCourseID() + "," + a.getStudentEmail() + "\n");
    		}
    		writer.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }

}
