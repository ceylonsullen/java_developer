package week5day2;

public class Trainee extends Employee {
	public Trainee(long id, String name,String address,  long phone, double salary) {
		super();
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	
	public Trainee() {};
}