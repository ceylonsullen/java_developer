package week5;

public class Students {

	private String name;
	private double grade;
	private double gpa;
	
	Students(String n, double gr, double gpa_in) {
		this.name = n;
		this.grade = gr;
		this.gpa = gpa_in;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}

