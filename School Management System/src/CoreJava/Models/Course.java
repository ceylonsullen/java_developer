package CoreJava.Models;

public class Course {
	
	private int ID;
	private String instructor, name;

    public void setID(int ID){
    	this.ID = ID;
    }

    public int getID(){
    	return this.ID;
    }

    public void setName(String name){
    	this.name = name;
    }

    public String getName(){
    	return this.name;
    }

    public void setInstructor(String instructor){
    	this.instructor = instructor;
    }

    public String getInstructor(){
    	return this.instructor;
    }

}
