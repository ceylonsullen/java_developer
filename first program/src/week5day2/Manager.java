package week5day2;

public class Manager extends Employee {
	public Manager(long id, String name,String address,  long phone, double salary) {
		super();
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	public Manager() {};
	public void calculateTransportAllowance() {
		
		System.out.println(this.basicSalary * 15 / 100);
	}
}
