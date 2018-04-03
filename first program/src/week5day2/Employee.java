package week5day2;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double Hra = 1000.50;
	Employee() {};
	Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	public void calculateSalary() {
		
		System.out.println(this.basicSalary + (this.basicSalary * this.specialAllowance / 100) + ( this.basicSalary * this.Hra / 100));
	}
	public void calculateTransportAllowance() {
		
		System.out.println(this.basicSalary * 10 / 100);
	}
}